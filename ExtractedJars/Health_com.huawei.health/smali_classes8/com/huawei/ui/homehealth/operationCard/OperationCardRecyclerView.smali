.class public Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView$HealthMainRecyclerViewLayoutManager;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 22
    new-instance v0, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView$HealthMainRecyclerViewLayoutManager;

    invoke-direct {v0, p1}, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView$HealthMainRecyclerViewLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    new-instance v0, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView$HealthMainRecyclerViewLayoutManager;

    invoke-direct {v0, p1}, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView$HealthMainRecyclerViewLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/operationCard/OperationCardRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 28
    return-void
.end method


# virtual methods
.method public onLayout(ZIIII)V
    .locals 0

    .line 47
    invoke-super/range {p0 .. p5}, Landroid/support/v7/widget/RecyclerView;->onLayout(ZIIII)V

    .line 48
    return-void
.end method

.method public requestLayout()V
    .locals 5

    .line 33
    :try_start_0
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    const-string v1, "mEatRequestLayout"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 34
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 35
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    const-string v1, "mLayoutFrozen"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 37
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 38
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_0

    .line 40
    :catch_0
    move-exception v4

    .line 41
    const-string v0, "OperationCardRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :goto_0
    return-void
.end method
