.class Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$1;
.super Ljava/lang/Object;
.source "TeamworkActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->initViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;->onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 0

    return-void
.end method

.method public onSubListBonusClicked(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V
    .locals 0

    return-void
.end method

.method public onSubListContentVisible(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V
    .locals 0

    return-void
.end method
