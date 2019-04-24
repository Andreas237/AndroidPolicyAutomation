.class Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 316
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
