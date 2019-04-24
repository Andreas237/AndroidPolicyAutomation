.class Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->initCountryCodeSpinner()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;

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

    .line 92
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;->onCountryCodeChanged(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V

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
