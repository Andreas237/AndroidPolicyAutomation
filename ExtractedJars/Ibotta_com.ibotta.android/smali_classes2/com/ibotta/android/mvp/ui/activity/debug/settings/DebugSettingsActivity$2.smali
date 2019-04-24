.class Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;
.super Ljava/lang/Object;
.source "DebugSettingsActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->initColumns()V
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

    .line 248
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 251
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    iget-object p2, p2, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;->onColumnsItemSelected(I)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
