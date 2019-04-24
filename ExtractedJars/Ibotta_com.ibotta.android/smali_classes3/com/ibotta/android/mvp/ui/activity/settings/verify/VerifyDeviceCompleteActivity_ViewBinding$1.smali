.class Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "VerifyDeviceCompleteActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;->onDoneClicked()V

    return-void
.end method
