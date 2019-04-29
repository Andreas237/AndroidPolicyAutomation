.class Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$2;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "ArticlesRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setRecyclerViewLayoutManager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
