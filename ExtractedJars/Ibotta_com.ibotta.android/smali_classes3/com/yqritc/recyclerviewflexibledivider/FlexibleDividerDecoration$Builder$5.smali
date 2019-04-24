.class Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;
.super Ljava/lang/Object;
.source "FlexibleDividerDecoration.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->size(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

.field final synthetic val$size:I


# direct methods
.method constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;I)V
    .locals 0

    .line 394
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;->this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    iput p2, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;->val$size:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dividerSize(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 397
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;->val$size:I

    return p1
.end method
