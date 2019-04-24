.class Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$1;
.super Ljava/lang/Object;
.source "LoyaltyCardShowActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->showRemoveCardConfirmation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onRemoveCanceled()V

    return-void
.end method
