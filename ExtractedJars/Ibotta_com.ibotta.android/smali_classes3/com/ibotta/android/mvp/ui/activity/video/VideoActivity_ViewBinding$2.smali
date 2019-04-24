.class Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "VideoActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->onVideoPlayClicked()V

    return-void
.end method
