.class Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;
.super Ljava/lang/Object;
.source "HorizontalDividerItemDecoration.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->margin(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

.field final synthetic val$leftMargin:I

.field final synthetic val$rightMargin:I


# direct methods
.method constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;II)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;->this$0:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    iput p2, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;->val$leftMargin:I

    iput p3, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;->val$rightMargin:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dividerLeftMargin(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 141
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;->val$leftMargin:I

    return p1
.end method

.method public dividerRightMargin(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 146
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;->val$rightMargin:I

    return p1
.end method
