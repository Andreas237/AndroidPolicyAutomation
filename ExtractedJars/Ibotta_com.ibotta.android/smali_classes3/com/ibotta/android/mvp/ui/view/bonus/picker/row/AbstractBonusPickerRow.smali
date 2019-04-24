.class public abstract Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.super Ljava/lang/Object;
.source "AbstractBonusPickerRow.java"


# instance fields
.field private final bonusPickerRowType:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field private containerVisible:Z

.field private listener:Lcom/ibotta/android/views/util/VisibilityListener;

.field private visible:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->bonusPickerRowType:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    return-void
.end method

.method private notifyVisibility()V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    if-eqz v0, :cond_1

    .line 56
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->containerVisible:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->visible:Z

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

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->bonusPickerRowType:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->bonusPickerRowType:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    return-object v0
.end method

.method public isContainerVisible()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->containerVisible:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->visible:Z

    return v0
.end method

.method public setContainerVisible(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->containerVisible:Z

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->notifyVisibility()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->listener:Lcom/ibotta/android/views/util/VisibilityListener;

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->visible:Z

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->notifyVisibility()V

    return-void
.end method
