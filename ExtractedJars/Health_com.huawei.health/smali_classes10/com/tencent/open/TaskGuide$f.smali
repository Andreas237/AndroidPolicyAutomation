.class Lcom/tencent/open/TaskGuide$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/TaskGuide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/tencent/open/TaskGuide;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TaskGuide;I)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$f;->b:Lcom/tencent/open/TaskGuide;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput p2, p0, Lcom/tencent/open/TaskGuide$f;->a:I

    .line 298
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 302
    move-object v2, p1

    check-cast v2, Landroid/widget/Button;

    .line 304
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$f;->b:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$f;->a:I

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;I)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    sget-object v1, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;

    if-ne v0, v1, :cond_0

    .line 305
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$f;->b:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$f;->a:I

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;I)V

    .line 306
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$f;->b:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$f;->a:I

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;I)V

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$f;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->e(Lcom/tencent/open/TaskGuide;)V

    .line 309
    return-void
.end method
