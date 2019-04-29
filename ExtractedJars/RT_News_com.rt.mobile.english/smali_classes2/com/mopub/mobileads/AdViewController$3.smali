.class Lcom/mopub/mobileads/AdViewController$3;
.super Ljava/lang/Object;
.source "AdViewController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/AdViewController;->setAdContentView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/AdViewController;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController$3;->this$0:Lcom/mopub/mobileads/AdViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/AdViewController$3;->val$view:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 528
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController$3;->this$0:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getMoPubView()Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 532
    :cond_0
    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->removeAllViews()V

    .line 533
    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController$3;->val$view:Landroid/view/View;

    iget-object v2, p0, Lcom/mopub/mobileads/AdViewController$3;->this$0:Lcom/mopub/mobileads/AdViewController;

    iget-object v3, p0, Lcom/mopub/mobileads/AdViewController$3;->val$view:Landroid/view/View;

    invoke-static {v2, v3}, Lcom/mopub/mobileads/AdViewController;->access$100(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/MoPubView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
