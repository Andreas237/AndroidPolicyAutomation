.class Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;
.super Ljava/lang/Object;
.source "FlexibleDividerDecoration.java"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;

.field final synthetic val$divider:Landroid/graphics/drawable/Drawable;


# direct methods
.method constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;->this$0:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;

    iput-object p2, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;->val$divider:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public drawableProvider(ILandroid/support/v7/widget/RecyclerView;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 61
    iget-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;->val$divider:Landroid/graphics/drawable/Drawable;

    return-object p1
.end method
