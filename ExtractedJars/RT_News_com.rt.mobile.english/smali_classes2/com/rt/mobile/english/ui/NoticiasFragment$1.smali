.class Lcom/rt/mobile/english/ui/NoticiasFragment$1;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "NoticiasFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/NoticiasFragment;->setRecyclerViewLayoutManager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/NoticiasFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/NoticiasFragment;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/rt/mobile/english/ui/NoticiasFragment$1;->this$0:Lcom/rt/mobile/english/ui/NoticiasFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
