.class Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;
.super Ljava/lang/Object;
.source "UpdateProfileActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

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

    .line 136
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->access$500(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    iget-object p2, p2, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/ibotta/api/call/customer/Gender;->fromString(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onGenderChanged(Lcom/ibotta/api/call/customer/Gender;)V

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
