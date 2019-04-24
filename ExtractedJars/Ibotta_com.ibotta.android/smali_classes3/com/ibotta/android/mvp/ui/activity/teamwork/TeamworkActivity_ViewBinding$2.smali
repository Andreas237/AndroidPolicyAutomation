.class Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "TeamworkActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->onFacebookSignInClicked()V

    return-void
.end method
