.class Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$1;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "PersonalStoresListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->access$000(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->access$100(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;ILcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;)I

    move-result p1

    return p1
.end method
