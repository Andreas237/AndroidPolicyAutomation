.class Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$2;
.super Ljava/lang/Object;
.source "VerifiedRebatesActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->showExitConfirmation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 283
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onExitConfirmationConfirmed()V

    return-void
.end method
