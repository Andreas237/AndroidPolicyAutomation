.class Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;
.super Ljava/lang/Object;
.source "FlexibleDividerDecoration.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->color(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

.field final synthetic val$color:I


# direct methods
.method constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;I)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;->this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    iput p2, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;->val$color:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dividerColor(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 0

    .line 361
    iget p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;->val$color:I

    return p1
.end method
