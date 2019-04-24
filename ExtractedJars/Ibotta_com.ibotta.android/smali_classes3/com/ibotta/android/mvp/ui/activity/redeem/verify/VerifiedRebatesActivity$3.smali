.class Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;
.super Ljava/lang/Object;
.source "VerifiedRebatesActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->showRemoveConfirmation(Lcom/ibotta/api/model/OfferModel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

.field final synthetic val$offerModel:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;->val$offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 305
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;->val$offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onRemoveConfirmationCancelled(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method
