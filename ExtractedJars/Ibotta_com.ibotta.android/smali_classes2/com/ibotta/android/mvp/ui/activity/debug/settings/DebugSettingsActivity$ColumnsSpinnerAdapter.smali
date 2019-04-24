.class Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "DebugSettingsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ColumnsSpinnerAdapter"
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

    const v0, 0x7f0c0147

    .line 212
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 213
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;->setDropDownViewResource(I)V

    return-void
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 232
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 0

    .line 218
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerViewHolder;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerViewHolder;-><init>()V

    .line 219
    invoke-static {p1, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-object p1
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 209
    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/String;)V
    .locals 0

    .line 226
    check-cast p3, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerViewHolder;

    .line 227
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
