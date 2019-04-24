.class Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;
.super Ljava/lang/Object;
.source "GroupedInventoryCardActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public mLastPosition:I

.field final synthetic this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 182
    iput p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->mLastPosition:I

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 190
    iget v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->mLastPosition:I

    if-ne v0, p1, :cond_0

    return-void

    .line 193
    :cond_0
    iput p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->mLastPosition:I

    .line 194
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    const-string v0, "btn:inventory-card-group-changed"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->trackCardEvent(Ljava/lang/String;[Ljava/lang/String;)V

    .line 195
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getPromotionId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->access$000(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->setPreferredInventoryGroup(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
