.class Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1$1;
.super Ljava/lang/Object;
.source "MraidController.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;Landroid/view/View;)V
    .locals 0

    .line 403
    iput-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1$1;->this$1:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;

    iput-object p2, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1$1;->val$view:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1$1;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 407
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1$1;->this$1:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;

    iget-object v0, v0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;->this$0:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->access$400(Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;)V

    const/4 v0, 0x1

    return v0
.end method
