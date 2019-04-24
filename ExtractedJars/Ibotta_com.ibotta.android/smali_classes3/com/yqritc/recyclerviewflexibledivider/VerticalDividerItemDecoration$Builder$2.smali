.class Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;
.super Ljava/lang/Object;
.source "VerticalDividerItemDecoration.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->margin(II)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

.field final synthetic val$bottomMargin:I

.field final synthetic val$topMargin:I


# direct methods
.method constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;II)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;->this$0:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    iput p2, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;->val$topMargin:I

    iput p3, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;->val$bottomMargin:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dividerBottomMargin(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 146
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;->val$bottomMargin:I

    return p1
.end method

.method public dividerTopMargin(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 141
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;->val$topMargin:I

    return p1
.end method
