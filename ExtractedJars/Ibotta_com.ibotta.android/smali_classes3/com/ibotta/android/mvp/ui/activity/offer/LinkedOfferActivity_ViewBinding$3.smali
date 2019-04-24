.class Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "LinkedOfferActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->onNoThanksClicked()V

    return-void
.end method
