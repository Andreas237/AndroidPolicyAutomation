.class Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;
.super Lcom/ibotta/android/commons/view/list/ViewHolder;
.source "SpinnerRouteItemAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SpinnerItemViewHolder"
.end annotation


# instance fields
.field private final tvName:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/list/ViewHolder;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;->tvName:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;->tvName:Landroid/widget/TextView;

    return-object p0
.end method
