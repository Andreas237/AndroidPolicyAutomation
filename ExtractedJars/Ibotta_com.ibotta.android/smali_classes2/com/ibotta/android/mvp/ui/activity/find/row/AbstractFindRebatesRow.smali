.class public abstract Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;
.super Ljava/lang/Object;
.source "AbstractFindRebatesRow.java"


# instance fields
.field private containerVisible:Z

.field private final findRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

.field private index:I

.field private listener:Lcom/ibotta/android/views/util/VisibilityListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private moduleIndex:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private moduleName:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private visible:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->findRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    return-void
.end method

.method private notifyVisibility()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    if-eqz v0, :cond_1

    .line 84
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->containerVisible:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->visible:Z

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
.method public getIndex()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->index:I

    return v0
.end method

.method public getListener()Lcom/ibotta/android/views/util/VisibilityListener;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-object v0
.end method

.method public getModuleIndex()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->moduleIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->findRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public isContainerVisible()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->containerVisible:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->visible:Z

    return v0
.end method

.method public setContainerVisible(Z)V
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->containerVisible:Z

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->notifyVisibility()V

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->index:I

    return-void
.end method

.method public setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-void
.end method

.method public setModuleIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->moduleIndex:Ljava/lang/Integer;

    return-void
.end method

.method public setModuleName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->moduleName:Ljava/lang/String;

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->visible:Z

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->notifyVisibility()V

    return-void
.end method
