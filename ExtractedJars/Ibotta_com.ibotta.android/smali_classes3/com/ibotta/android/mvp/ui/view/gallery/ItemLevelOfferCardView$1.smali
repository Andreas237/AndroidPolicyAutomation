.class Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;
.super Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;
.source "ItemLevelOfferCardView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateCardClickListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-void
.end method


# virtual methods
.method public onDebouncedClick(Landroid/view/View;)V
    .locals 2

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 52
    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    iget-object v1, v1, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    .line 51
    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
