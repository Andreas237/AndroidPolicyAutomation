.class Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$1;
.super Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;
.source "SpotlightAvailableAtView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->initLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-void
.end method


# virtual methods
.method public onDebouncedClick(Landroid/view/View;)V
    .locals 0

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->onCantFindItemClicked()V

    return-void
.end method
