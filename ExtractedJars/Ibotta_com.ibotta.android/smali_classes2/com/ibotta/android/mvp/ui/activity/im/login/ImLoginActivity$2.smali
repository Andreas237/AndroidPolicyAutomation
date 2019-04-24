.class Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$2;
.super Ljava/lang/Object;
.source "ImLoginActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 158
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->onPasswordUpdated(Ljava/lang/String;)V

    return-void
.end method
