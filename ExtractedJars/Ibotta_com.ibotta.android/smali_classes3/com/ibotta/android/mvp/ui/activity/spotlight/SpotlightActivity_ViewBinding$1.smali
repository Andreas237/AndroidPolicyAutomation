.class Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SpotlightActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 55
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->onTopSpacingClicked()V

    return-void
.end method
