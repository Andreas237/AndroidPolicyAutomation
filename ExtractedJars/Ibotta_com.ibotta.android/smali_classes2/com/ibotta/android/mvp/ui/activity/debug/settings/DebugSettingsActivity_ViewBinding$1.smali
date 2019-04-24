.class Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "DebugSettingsActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 47
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->onUseDebugApiChecked()V

    return-void
.end method
