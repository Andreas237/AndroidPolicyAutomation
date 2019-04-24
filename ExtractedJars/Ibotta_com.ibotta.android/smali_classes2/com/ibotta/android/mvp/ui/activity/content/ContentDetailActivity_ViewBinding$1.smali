.class Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ContentDetailActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;->onPayAtRetailerClicked(Landroid/view/View;)V

    return-void
.end method
