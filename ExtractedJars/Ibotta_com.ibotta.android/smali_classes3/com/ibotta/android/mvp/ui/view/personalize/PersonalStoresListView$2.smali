.class Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$2;
.super Ljava/lang/Object;
.source "PersonalStoresListView.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initDivider()V
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

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldHideDivider(ILandroid/support/v7/widget/RecyclerView;)Z
    .locals 0

    .line 97
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$2;->this$0:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->access$000(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;

    return p1
.end method
