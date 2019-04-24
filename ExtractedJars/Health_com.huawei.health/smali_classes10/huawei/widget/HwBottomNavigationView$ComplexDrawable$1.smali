.class Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;-><init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

.field final synthetic val$this$0:Lhuawei/widget/HwBottomNavigationView;


# direct methods
.method constructor <init>(Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;Lhuawei/widget/HwBottomNavigationView;)V
    .locals 0

    .line 888
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;->this$1:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    iput-object p2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;->val$this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 891
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;->this$1:Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;

    .line 892
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 891
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->access$500(Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;I)V

    .line 893
    return-void
.end method
