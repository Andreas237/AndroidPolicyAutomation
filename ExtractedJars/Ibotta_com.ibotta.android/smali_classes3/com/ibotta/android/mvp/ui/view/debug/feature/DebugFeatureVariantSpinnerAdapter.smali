.class public Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "DebugFeatureVariantSpinnerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c014b

    .line 23
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter;->setDropDownViewResource(I)V

    return-void
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 42
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 0

    .line 29
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;-><init>()V

    .line 30
    invoke-static {p1, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-object p1
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 21
    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/String;)V
    .locals 0

    .line 37
    check-cast p3, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;

    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
