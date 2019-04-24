.class public Lcom/huawei/wallet/ui/carddisplay/CardLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI6;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI5;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI4;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI3;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI2;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$CardLayoutSAI1;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;,
        Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/graphics/Bitmap;

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:Landroid/view/VelocityTracker;

.field private I:Landroid/widget/Scroller;

.field private J:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;

.field private K:F

.field private L:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;

.field private M:I

.field private N:Z

.field private final O:Landroid/os/Handler;

.field private P:Ljava/lang/Runnable;

.field private Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

.field private R:I

.field private final S:Ljava/lang/Runnable;

.field protected a:I

.field protected b:I

.field protected volatile c:I

.field protected d:I

.field protected e:I

.field protected f:Landroid/widget/ImageView;

.field protected g:I

.field protected h:I

.field protected i:I

.field private j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

.field protected k:I

.field protected l:I

.field protected m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

.field protected n:Landroid/view/animation/DecelerateInterpolator;

.field protected o:I

.field protected p:I

.field private q:Z

.field protected r:I

.field private s:I

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Landroid/view/WindowManager$LayoutParams;

.field private y:Landroid/os/Vibrator;

.field private z:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 274
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 275
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 279
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 280
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 284
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->u:Z

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->q:Z

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    .line 241
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->N:Z

    .line 248
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->M:I

    .line 302
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    .line 305
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->S:Ljava/lang/Runnable;

    .line 346
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->P:Ljava/lang/Runnable;

    .line 286
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->z:Landroid/view/WindowManager;

    .line 287
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->z:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 288
    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->C:I

    .line 289
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    .line 290
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    .line 291
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->K:F

    .line 293
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->y:Landroid/os/Vibrator;

    .line 294
    invoke-static {p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->D:I

    .line 295
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->K:F

    const/high16 v1, 0x42480000    # 50.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    .line 296
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->K:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->G:I

    .line 298
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    .line 300
    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 8

    .line 655
    const/4 v3, 0x0

    .line 656
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 657
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 658
    iget v3, v4, Landroid/graphics/Rect;->top:I

    .line 659
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 664
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 665
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    .line 666
    const-string v0, "status_bar_height"

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 667
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_5

    move-result v0

    move v3, v0

    .line 693
    goto :goto_0

    .line 669
    :catch_0
    move-exception v6

    .line 671
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight ClassNotFoundException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 693
    goto :goto_0

    .line 673
    :catch_1
    move-exception v6

    .line 675
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight InstantiationException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 693
    goto :goto_0

    .line 677
    :catch_2
    move-exception v6

    .line 679
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight IllegalAccessException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 693
    goto :goto_0

    .line 681
    :catch_3
    move-exception v6

    .line 683
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight NumberFormatException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 693
    goto :goto_0

    .line 686
    :catch_4
    move-exception v6

    .line 688
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight IllegalArgumentException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 693
    goto :goto_0

    .line 690
    :catch_5
    move-exception v6

    .line 692
    const-string v0, "CardLayout"

    const-string v1, " getStatusHeight NoSuchFieldException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 696
    :cond_0
    :goto_0
    return v3
.end method

.method private a()V
    .locals 7

    .line 1050
    sget-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    .line 1051
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->C:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    add-int v6, v0, v1

    .line 1053
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    neg-int v3, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1054
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->postInvalidate()V

    .line 1055
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1001
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealMoveEvent itemView= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1002
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    if-nez v0, :cond_0

    .line 1004
    return-void

    .line 1007
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v3, v0

    .line 1008
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 1010
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->N:Z

    if-eqz v0, :cond_7

    .line 1013
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/base/R$id;->card_virtual:I

    if-ne v0, v1, :cond_3

    .line 1015
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    sub-int v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-gt v0, v1, :cond_1

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    sub-int v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-le v0, v1, :cond_2

    .line 1017
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    .line 1019
    :cond_2
    return-void

    .line 1023
    :cond_3
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getScrollVelocity()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0x258

    if-gt v0, v1, :cond_4

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    sub-int v0, v3, v0

    .line 1024
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-le v0, v1, :cond_5

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    sub-int v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-ge v0, v1, :cond_5

    .line 1026
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    if-nez v0, :cond_5

    .line 1028
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    .line 1030
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->u:Z

    if-eqz v0, :cond_5

    .line 1032
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1037
    :cond_5
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    sub-int v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-gt v0, v1, :cond_6

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    sub-int v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->E:I

    if-le v0, v1, :cond_7

    .line 1039
    :cond_6
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    .line 1043
    :cond_7
    return-void
.end method

.method private a(Landroid/view/MotionEvent;I)Z
    .locals 6

    .line 1164
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    if-eqz v0, :cond_0

    .line 1166
    const/4 v0, 0x1

    return v0

    .line 1168
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(Landroid/view/MotionEvent;)V

    .line 1169
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 1170
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 1173
    :pswitch_0
    goto :goto_1

    .line 1178
    :pswitch_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 1179
    .line 1180
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    or-int/lit8 v0, v0, 0x3

    .line 1179
    invoke-virtual {v3, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 1181
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1182
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 1184
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    sub-int v4, v0, v2

    .line 1185
    iput v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    .line 1188
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->u:Z

    if-eqz v0, :cond_1

    .line 1190
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/view/View;->scrollBy(II)V

    .line 1192
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1194
    :pswitch_2
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->u:Z

    if-eqz v0, :cond_4

    .line 1196
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getScrollVelocity()I

    move-result v5

    .line 1197
    const/16 v0, 0x258

    if-le v5, v0, :cond_2

    .line 1199
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a()V

    goto :goto_0

    .line 1201
    :cond_2
    const/16 v0, -0x258

    if-ge v5, v0, :cond_3

    .line 1203
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i()V

    goto :goto_0

    .line 1207
    :cond_3
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k()V

    .line 1211
    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f()V

    .line 1213
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    .line 1214
    .line 1218
    :goto_1
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->N:Z

    return v0
.end method

.method private b(II)I
    .locals 5

    .line 747
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    .line 748
    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    .line 749
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 751
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 753
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, v4, p1, p2, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d(Landroid/view/View;III)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 755
    return v3

    .line 749
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 759
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private b(Landroid/graphics/Bitmap;II)V
    .locals 4

    .line 447
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 449
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 450
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 451
    const/4 v0, 0x0

    aget v0, v3, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->R:I

    .line 452
    goto :goto_0

    .line 455
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->R:I

    .line 458
    :goto_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    .line 459
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 460
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 462
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->R:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 464
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int v1, p3, v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->D:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 466
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 467
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 468
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x18

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 471
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    .line 472
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 473
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->z:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1253
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 1255
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    .line 1258
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1259
    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/carddisplay/CardLayout;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)I
    .locals 0

    .line 40
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->F:I

    return p1
.end method

.method private c()V
    .locals 3

    .line 629
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onStopDrag slidePosition= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",mDragImageView="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 630
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    if-eqz v0, :cond_0

    .line 632
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setCanRebound(Z)V

    .line 634
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d()V

    .line 636
    return-void
.end method

.method private c(II)V
    .locals 5

    .line 511
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->R:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 512
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int v1, p2, v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->D:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 513
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->z:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->x:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 514
    invoke-virtual {p0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d(II)V

    .line 517
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    if-eqz v0, :cond_2

    .line 519
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c()Z

    move-result v3

    .line 520
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b()Z

    move-result v4

    .line 522
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_0

    if-eqz v3, :cond_0

    .line 524
    return-void

    .line 527
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_1

    if-eqz v4, :cond_1

    .line 529
    return-void

    .line 531
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->P:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 533
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;Landroid/graphics/Bitmap;II)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(Landroid/graphics/Bitmap;II)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/view/View;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    return-object v0
.end method

.method private d(Landroid/view/View;III)Z
    .locals 9

    .line 843
    if-nez p1, :cond_0

    .line 845
    const/4 v0, 0x0

    return v0

    .line 847
    :cond_0
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 848
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 850
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 851
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getLocationOnScreen([I)V

    .line 853
    const/4 v0, 0x0

    aget v0, v3, v0

    add-int v4, v0, p2

    .line 854
    const/4 v0, 0x1

    aget v0, v3, v0

    add-int v5, v0, p3

    .line 856
    div-int/lit8 p4, p4, 0x2

    .line 858
    const/4 v0, 0x0

    aget v0, v2, v0

    if-lt v4, v0, :cond_1

    const/4 v0, 0x0

    aget v0, v2, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    if-ge v4, v0, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 859
    :goto_0
    const/4 v0, 0x1

    aget v0, v2, v0

    if-lt v5, v0, :cond_2

    const/4 v0, 0x1

    aget v0, v2, v0

    add-int/2addr v0, p4

    if-ge v5, v0, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 861
    :goto_1
    if-eqz v6, :cond_3

    if-eqz v7, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    .line 862
    :goto_2
    return v8
.end method

.method private e(II)I
    .locals 5

    .line 766
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    .line 769
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->N:Z

    if-eqz v0, :cond_0

    .line 771
    invoke-virtual {p0, v1, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d(III)I

    move-result v0

    return v0

    .line 776
    :cond_0
    add-int/lit8 v3, v1, -0x1

    :goto_0
    if-ltz v3, :cond_4

    .line 778
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 780
    add-int/lit8 v0, v1, -0x2

    if-eq v3, v0, :cond_1

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c:I

    if-ne v3, v0, :cond_2

    .line 782
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v2

    goto :goto_1

    .line 786
    :cond_2
    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->G:I

    .line 788
    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v4, p1, p2, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(Landroid/view/View;III)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 790
    return v3

    .line 776
    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 795
    :cond_4
    const/4 v0, -0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->M:I

    return v0
.end method

.method private e(Landroid/view/MotionEvent;I)V
    .locals 3

    .line 1124
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 1129
    :pswitch_0
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v2

    .line 1130
    .line 1131
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    or-int/lit8 v0, v0, 0x3

    .line 1130
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 1132
    invoke-virtual {p0, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1133
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 1135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g:I

    .line 1136
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    .line 1137
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->h:I

    if-le v0, v1, :cond_0

    .line 1139
    sget-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    goto :goto_0

    .line 1141
    :cond_0
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->h:I

    if-ge v0, v1, :cond_1

    .line 1143
    sget-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    .line 1145
    :cond_1
    :goto_0
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->h:I

    .line 1148
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c(II)V

    .line 1149
    goto :goto_1

    .line 1151
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c()V

    .line 1152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    .line 1153
    goto :goto_1

    .line 1155
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->S:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1156
    .line 1160
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic f(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/graphics/Bitmap;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->B:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private f()V
    .locals 1

    .line 1266
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 1268
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 1269
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    .line 1271
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    return-object v0
.end method

.method private getScrollVelocity()I
    .locals 3

    .line 1280
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1281
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->H:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    float-to-int v2, v0

    .line 1282
    return v2
.end method

.method static synthetic h(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Ljava/lang/Runnable;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->P:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/os/Vibrator;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->y:Landroid/os/Vibrator;

    return-object v0
.end method

.method private i()V
    .locals 7

    .line 1062
    sget-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    .line 1063
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->C:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int v6, v0, v1

    .line 1065
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    move v3, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1066
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->postInvalidate()V

    .line 1067
    return-void
.end method

.method static synthetic k(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 1075
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->C:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_0

    .line 1077
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i()V

    goto :goto_0

    .line 1079
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->C:I

    neg-int v1, v1

    div-int/lit8 v1, v1, 0x2

    if-gt v0, v1, :cond_1

    .line 1081
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a()V

    goto :goto_0

    .line 1086
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 1089
    :goto_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    return-object v0
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 577
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 578
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    int-to-float v1, v1

    invoke-static {v2, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->d(Landroid/view/View;IF)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 579
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v3, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 580
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 581
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    .line 582
    return-void
.end method

.method protected b()V
    .locals 5

    .line 640
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 641
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    int-to-float v2, v2

    invoke-static {v3, v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->c(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 643
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v4, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 644
    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    .line 645
    return-void
.end method

.method public computeScroll()V
    .locals 3

    .line 1225
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1228
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrY()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 1230
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->postInvalidate()V

    .line 1233
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1235
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 1236
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->removeViewAt(I)V

    .line 1237
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->J:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;

    if-eqz v0, :cond_0

    .line 1239
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->J:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;->c(Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;I)V

    .line 1244
    :cond_0
    return-void
.end method

.method protected d(III)I
    .locals 4

    .line 800
    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    .line 801
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    .line 803
    invoke-virtual {p0, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 805
    add-int/lit8 v0, p1, -0x1

    if-ne v2, v0, :cond_0

    .line 807
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 810
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, v3, p2, p3, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(Landroid/view/View;III)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 812
    return v2

    .line 801
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 815
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public d()V
    .locals 3

    .line 482
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    .line 483
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 485
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->z:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 486
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    .line 488
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    if-eqz v0, :cond_0

    .line 490
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->F:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;->d(II)V

    .line 492
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b()V

    .line 494
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->B:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 496
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 497
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->B:Landroid/graphics/Bitmap;

    .line 499
    :cond_2
    return-void
.end method

.method protected d(II)V
    .locals 4

    .line 544
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int/2addr p2, v0

    .line 545
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(II)I

    move-result v3

    .line 546
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tempPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",slidePosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", mLastTempPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 550
    const/4 v0, -0x1

    if-eq v3, v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 553
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    if-eq v3, v0, :cond_1

    .line 556
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    if-eqz v0, :cond_0

    .line 558
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-interface {v0, v1, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;->a(II)V

    .line 560
    :cond_0
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(I)V

    goto :goto_0

    .line 565
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 567
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(I)V

    .line 572
    :cond_2
    :goto_0
    iput v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e:I

    .line 573
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 893
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->M:I

    .line 894
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->M:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 898
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(Landroid/view/MotionEvent;)V

    .line 901
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->I:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 903
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 905
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    .line 906
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    .line 908
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->h:I

    .line 910
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    .line 912
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dispatchTouchEvent ACTION_DOWN slidePosition= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 915
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 917
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 921
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    .line 922
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v4

    .line 923
    sget v0, Lcom/huawei/base/R$id;->card_brief:I

    if-eq v4, v0, :cond_2

    sget v0, Lcom/huawei/base/R$id;->card_virtual:I

    if-ne v4, v0, :cond_3

    .line 925
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 928
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 931
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->q:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 933
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->S:Ljava/lang/Runnable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 936
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e:I

    .line 937
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    .line 938
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->p:I

    .line 939
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    .line 942
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 944
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->B:Landroid/graphics/Bitmap;

    .line 946
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 948
    goto/16 :goto_0

    .line 953
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(Landroid/view/MotionEvent;)V

    .line 954
    goto/16 :goto_0

    .line 958
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 959
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f()V

    .line 960
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->S:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 962
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 964
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dispatchTouchEvent ACTION_UP slidePosition= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isMove= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isDrag= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isHorSlide="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", itemView.getId()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    .line 967
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 964
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 968
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e()Z

    move-result v4

    .line 969
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "flag is :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 970
    if-eqz v4, :cond_5

    .line 972
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->L:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;

    if-eqz v0, :cond_5

    .line 974
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c:I

    .line 975
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->L:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;->c(Landroid/view/View;I)V

    .line 979
    :cond_5
    goto :goto_0

    .line 983
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 984
    .line 990
    :cond_6
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method protected e(I)V
    .locals 6

    .line 593
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_1

    .line 595
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSwapItem this.moveDirection == MoveDirection.DOWM mSlidePosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 596
    add-int/lit8 v3, p1, 0x1

    .line 597
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v0

    if-lt v3, v0, :cond_0

    .line 599
    return-void

    .line 601
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 602
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    int-to-float v1, v1

    invoke-static {v4, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->d(Landroid/view/View;IF)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 603
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;

    invoke-direct {v0, p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)V

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 604
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->n:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 605
    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    .line 607
    goto :goto_0

    .line 611
    :cond_1
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSwapItem this.moveDirection == MoveDirection.up  mSlidePosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 612
    add-int/lit8 v3, p1, -0x1

    .line 613
    if-gez v3, :cond_2

    .line 615
    return-void

    .line 617
    :cond_2
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 618
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    int-to-float v1, v1

    invoke-static {v4, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->d(Landroid/view/View;IF)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 619
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;

    invoke-direct {v0, p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)V

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 620
    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    .line 622
    :goto_0
    return-void
.end method

.method protected e()Z
    .locals 6

    .line 867
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 869
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    .line 870
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    if-nez v0, :cond_0

    sget v0, Lcom/huawei/base/R$id;->card_brief:I

    if-eq v2, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 871
    :goto_0
    const/4 v4, 0x0

    .line 872
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 875
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 877
    const/4 v4, 0x1

    .line 880
    :cond_1
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 883
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method protected e(Landroid/view/View;III)Z
    .locals 9

    .line 820
    if-nez p1, :cond_0

    .line 822
    const/4 v0, 0x0

    return v0

    .line 824
    :cond_0
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 825
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 827
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 828
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getLocationOnScreen([I)V

    .line 830
    const/4 v0, 0x0

    aget v0, v3, v0

    add-int v4, v0, p2

    .line 831
    const/4 v0, 0x1

    aget v0, v3, v0

    add-int v5, v0, p3

    .line 833
    const/4 v0, 0x0

    aget v0, v2, v0

    if-lt v4, v0, :cond_1

    const/4 v0, 0x0

    aget v0, v2, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    if-ge v4, v0, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 834
    :goto_0
    const/4 v0, 0x1

    aget v0, v2, v0

    if-lt v5, v0, :cond_2

    const/4 v0, 0x1

    aget v0, v2, v0

    add-int/2addr v0, p4

    if-ge v5, v0, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 836
    :goto_1
    if-eqz v6, :cond_3

    if-eqz v7, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    .line 838
    :goto_2
    return v8
.end method

.method public getItemView()Landroid/view/View;
    .locals 1

    .line 731
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    return-object v0
.end method

.method public getLastClickItemPos()I
    .locals 1

    .line 434
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c:I

    return v0
.end method

.method public getSlidePosition()I
    .locals 1

    .line 711
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    return v0
.end method

.method public getTargetHeight()I
    .locals 1

    .line 1287
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->s:I

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1098
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 1099
    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    const/4 v0, 0x1

    if-ne v2, v0, :cond_1

    .line 1101
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->v:Z

    .line 1104
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 1106
    invoke-direct {p0, p1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(Landroid/view/MotionEvent;I)Z

    goto :goto_0

    .line 1110
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->t:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 1113
    invoke-direct {p0, p1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(Landroid/view/MotionEvent;I)V

    .line 1114
    const/4 v0, 0x1

    return v0

    .line 1119
    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setAllCollapse(Z)V
    .locals 0

    .line 1302
    iput-boolean p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->N:Z

    .line 1303
    return-void
.end method

.method public setCardDisplayHeight(I)V
    .locals 0

    .line 741
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->l:I

    .line 742
    return-void
.end method

.method public setDragEnable(Z)V
    .locals 1

    .line 1322
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->q:Z

    .line 1323
    return-void
.end method

.method public setHorSlideEnable(Z)V
    .locals 0

    .line 1312
    iput-boolean p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->u:Z

    .line 1313
    return-void
.end method

.method public setInitTopCardY(I)V
    .locals 1

    .line 424
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->r:I

    .line 425
    return-void
.end method

.method public setItemClickListener(Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;)V
    .locals 1

    .line 1307
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->L:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;

    .line 1308
    return-void
.end method

.method public setItemView(Landroid/view/View;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->A:Landroid/view/View;

    .line 737
    return-void
.end method

.method public setLastClickItemPos(I)V
    .locals 0

    .line 429
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c:I

    .line 430
    return-void
.end method

.method public setOnChangeListener(Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;)V
    .locals 1

    .line 419
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->j:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    .line 420
    return-void
.end method

.method public setOnItemRemovedListener(Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;)V
    .locals 0

    .line 706
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->J:Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnRemovedListener;

    .line 707
    return-void
.end method

.method public setParentScrollView(Lcom/huawei/wallet/ui/carddisplay/HwScrollView;)V
    .locals 1

    .line 409
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->Q:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    .line 410
    return-void
.end method

.method public setSlide(Z)V
    .locals 0

    .line 726
    iput-boolean p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->w:Z

    .line 727
    return-void
.end method

.method public setSlidePosition(I)V
    .locals 0

    .line 716
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    .line 717
    return-void
.end method

.method public setTargetHeight(I)V
    .locals 0

    .line 1292
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->s:I

    .line 1293
    return-void
.end method
