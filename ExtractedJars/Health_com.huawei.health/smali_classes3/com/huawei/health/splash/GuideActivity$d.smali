.class Lcom/huawei/health/splash/GuideActivity$d;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/splash/GuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/splash/GuideActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/splash/GuideActivity;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/splash/GuideActivity;Lcom/huawei/health/splash/GuideActivity$1;)V
    .locals 0

    .line 142
    invoke-direct {p0, p1}, Lcom/huawei/health/splash/GuideActivity$d;-><init>(Lcom/huawei/health/splash/GuideActivity;)V

    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-static {v0}, Lcom/huawei/health/splash/GuideActivity;->a(Lcom/huawei/health/splash/GuideActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 149
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    sub-float/2addr v1, v2

    .line 148
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 149
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-static {v1}, Lcom/huawei/health/splash/GuideActivity;->c(Lcom/huawei/health/splash/GuideActivity;)I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    .line 150
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-static {v1}, Lcom/huawei/health/splash/GuideActivity;->c(Lcom/huawei/health/splash/GuideActivity;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 151
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-static {v1}, Lcom/huawei/health/splash/GuideActivity;->c(Lcom/huawei/health/splash/GuideActivity;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/huawei/health/splash/GuideActivity;->setResult(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity$d;->c:Lcom/huawei/health/splash/GuideActivity;

    invoke-virtual {v0}, Lcom/huawei/health/splash/GuideActivity;->finish()V

    .line 154
    const/4 v0, 0x1

    return v0

    .line 158
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
