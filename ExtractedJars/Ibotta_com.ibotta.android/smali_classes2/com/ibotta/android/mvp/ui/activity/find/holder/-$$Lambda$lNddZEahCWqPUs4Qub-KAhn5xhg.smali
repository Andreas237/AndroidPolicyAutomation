.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/find/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;->f$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    return-void
.end method


# virtual methods
.method public final onVisibilityChanged(Z)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;->f$0:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibilityScrollTrackingEnabled(Z)V

    return-void
.end method
