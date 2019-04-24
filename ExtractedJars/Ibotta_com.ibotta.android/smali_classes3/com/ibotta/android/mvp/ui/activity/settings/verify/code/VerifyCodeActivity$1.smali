.class Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity$1;
.super Landroid/telephony/PhoneNumberFormattingTextWatcher;
.source "VerifyCodeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->initCodeInput()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;

    invoke-direct {p0}, Landroid/telephony/PhoneNumberFormattingTextWatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;->onCodeChanged(Ljava/lang/String;)V

    return-void
.end method
