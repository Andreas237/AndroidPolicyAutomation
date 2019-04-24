.class Lhuawei/widget/HwSubTabViewContainer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/HwSubTabViewContainer;->ensureScrollAnimator()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwSubTabViewContainer;


# direct methods
.method constructor <init>(Lhuawei/widget/HwSubTabViewContainer;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lhuawei/widget/HwSubTabViewContainer$1;->this$0:Lhuawei/widget/HwSubTabViewContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 120
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer$1;->this$0:Lhuawei/widget/HwSubTabViewContainer;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwSubTabViewContainer;->scrollTo(II)V

    .line 121
    return-void
.end method
