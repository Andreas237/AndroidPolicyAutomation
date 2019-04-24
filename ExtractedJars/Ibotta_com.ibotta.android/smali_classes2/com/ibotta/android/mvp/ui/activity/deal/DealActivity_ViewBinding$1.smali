.class Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "DealActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 38
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->onTopSpacingClicked()V

    return-void
.end method
