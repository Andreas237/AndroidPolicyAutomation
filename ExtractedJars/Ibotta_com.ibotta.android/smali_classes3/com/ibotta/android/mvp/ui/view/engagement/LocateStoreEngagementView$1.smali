.class Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;
.super Lcom/ibotta/android/view/common/OnGlobalLayoutListener;
.source "LocateStoreEngagementView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->initMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;Landroid/view/View;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-direct {p0, p2}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 131
    invoke-super {p0}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->onGlobalLayout()V

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;->detach()V

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->access$000(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V

    return-void
.end method
