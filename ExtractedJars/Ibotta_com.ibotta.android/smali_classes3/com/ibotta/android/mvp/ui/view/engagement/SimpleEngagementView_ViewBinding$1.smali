.class Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SimpleEngagementView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 42
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->onSubmitClicked()V

    return-void
.end method
