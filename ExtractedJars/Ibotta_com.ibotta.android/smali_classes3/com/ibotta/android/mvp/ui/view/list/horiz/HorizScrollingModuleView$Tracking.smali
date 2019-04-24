.class Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;
.super Ljava/lang/Object;
.source "HorizScrollingModuleView.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Tracking"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;->this$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$1;)V
    .locals 0

    .line 198
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    return-void
.end method


# virtual methods
.method public onInsufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onTrackChildren(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;->this$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->access$100(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;->this$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->access$100(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;->onItemsVisible(Ljava/util/Set;)V

    :cond_0
    return-void
.end method
