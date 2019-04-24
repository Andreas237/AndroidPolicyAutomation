.class Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$1;
.super Ljava/lang/Object;
.source "DebugSettingsActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

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

    .line 95
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;->onHostNameTextChanged(Ljava/lang/String;)V

    return-void
.end method
