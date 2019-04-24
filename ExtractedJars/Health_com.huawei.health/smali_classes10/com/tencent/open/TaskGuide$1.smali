.class Lcom/tencent/open/TaskGuide$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/TaskGuide;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/tencent/open/TaskGuide;


# direct methods
.method constructor <init>(Lcom/tencent/open/TaskGuide;I)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    iput p2, p0, Lcom/tencent/open/TaskGuide$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 247
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 248
    iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/tencent/open/TaskGuide$i;

    .line 250
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V

    .line 251
    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 252
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/tencent/open/TaskGuide$i;

    .line 253
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V

    .line 254
    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 255
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/tencent/open/TaskGuide$i;

    .line 256
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V

    .line 257
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 258
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/tencent/open/TaskGuide$i;

    .line 259
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V

    .line 263
    :cond_2
    :goto_0
    return-void
.end method
