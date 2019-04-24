.class Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;
.super Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$FormTextWatcher;
.source "UpdateProfileActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->initListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$FormTextWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onFirstNameChanged(Ljava/lang/String;)V

    return-void
.end method
