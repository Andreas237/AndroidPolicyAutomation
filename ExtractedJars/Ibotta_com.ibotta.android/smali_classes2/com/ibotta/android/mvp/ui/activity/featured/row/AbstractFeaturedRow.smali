.class public abstract Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.super Ljava/lang/Object;
.source "AbstractFeaturedRow.java"


# instance fields
.field private containerVisible:Z

.field private final featuredRowType:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field private listener:Lcom/ibotta/android/views/util/VisibilityListener;

.field private visible:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->featuredRowType:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    return-void
.end method

.method private notifyVisibility()V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    if-eqz v0, :cond_1

    .line 52
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->containerVisible:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->visible:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/ibotta/android/views/util/VisibilityListener;->onVisibilityChanged(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public getListener()Lcom/ibotta/android/views/util/VisibilityListener;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->featuredRowType:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public isContainerVisible()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->containerVisible:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->visible:Z

    return v0
.end method

.method public setContainerVisible(Z)V
    .locals 0

    .line 38
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->containerVisible:Z

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->notifyVisibility()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 25
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->visible:Z

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->notifyVisibility()V

    return-void
.end method
