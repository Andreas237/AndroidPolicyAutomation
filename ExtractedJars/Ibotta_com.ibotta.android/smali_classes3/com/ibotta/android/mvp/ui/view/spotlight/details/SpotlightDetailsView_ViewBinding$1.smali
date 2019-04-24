.class Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SpotlightDetailsView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->onCheckProductClicked()V

    return-void
.end method
