.class public Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
.super Ljava/lang/Object;
.source "IUserEventView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/logging/IUserEventView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OptionalSetupParams"
.end annotation


# instance fields
.field public cellView:Landroid/view/View;

.field public displayPos:Ljava/lang/Integer;

.field public extraImpressionConstraintKeys:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public horizontalListDisplayPos:Ljava/lang/Integer;

.field public horizontalListViewCell:Landroid/view/View;

.field public suppressActionUntilManuallyTriggered:Z

.field public suppressImpressions:Z

.field public trackingUrl:Ljava/lang/String;

.field public useZMoatIID:Z

.field public userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field public userEventCoordinators:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field public verticalListDisplayPos:Ljava/lang/Integer;

.field public verticalListViewCell:Landroid/view/View;

.field public viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public copy()Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 3

    .line 117
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 118
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 119
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinators:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 120
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinators:Ljava/util/ArrayList;

    .line 122
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 123
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 125
    :cond_1
    iget-boolean v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 126
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 127
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 128
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListViewCell:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListViewCell:Landroid/view/View;

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListDisplayPos:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListDisplayPos:Ljava/lang/Integer;

    .line 130
    iget-boolean v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    .line 131
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 132
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 133
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 134
    iget-object v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 136
    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 138
    :cond_2
    iget-boolean v1, p0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    return-object v0
.end method
