.class public Lo/bvq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 31
    if-nez p0, :cond_0

    .line 32
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    :cond_0
    return-object p0
.end method

.method public static a(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 38
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 43
    :cond_1
    return-void
.end method

.method public static a([Ljava/lang/Integer;)[Ljava/lang/Integer;
    .locals 4

    .line 78
    if-eqz p0, :cond_0

    .line 79
    array-length v0, p0

    new-array v3, v0, [Ljava/lang/Integer;

    .line 80
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    return-object v3

    .line 83
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/util/List;Lo/bvr;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/bvr;I)V"
        }
    .end annotation

    .line 69
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkable:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 70
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(IZ)V

    goto :goto_0

    .line 73
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(IZ)V

    .line 75
    :goto_0
    return-void
.end method

.method public static c(ZLandroid/view/View;)V
    .locals 2

    .line 56
    if-eqz p0, :cond_0

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    :goto_0
    return-void
.end method

.method public static c(Ljava/util/List;)[Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)[Ljava/lang/String;"
        }
    .end annotation

    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    .line 24
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 25
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Attribute;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    .line 24
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 27
    :cond_0
    return-object v1
.end method

.method public static d(ILjava/util/List;)[Ljava/lang/Integer;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)[Ljava/lang/Integer;"
        }
    .end annotation

    .line 47
    const/4 v2, 0x0

    .line 48
    if-lez p0, :cond_0

    .line 49
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Integer;

    .line 50
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Attribute;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 52
    :cond_0
    return-object v2
.end method
