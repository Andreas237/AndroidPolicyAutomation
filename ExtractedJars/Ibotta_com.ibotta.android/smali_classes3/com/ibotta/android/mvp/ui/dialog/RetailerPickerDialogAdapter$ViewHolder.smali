.class public Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "RetailerPickerDialogAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ViewHolder"
.end annotation


# instance fields
.field protected ivRetailerLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c2
    .end annotation
.end field

.field protected llRetailerContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090325
    .end annotation
.end field

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;

.field protected tvRetailerName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056a
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;Landroid/view/View;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;

    .line 96
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 97
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method
