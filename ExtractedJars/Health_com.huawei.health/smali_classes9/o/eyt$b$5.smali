.class Lo/eyt$b$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyt$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eyt$b;


# direct methods
.method constructor <init>(Lo/eyt$b;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 85
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    iget-object v0, v0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    invoke-virtual {v0}, Lo/eyt$b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    invoke-virtual {v0}, Lo/eyt$b;->c()V

    .line 88
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/eyt$b;->c(ZZ)V

    .line 89
    return-void

    .line 93
    :cond_0
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    invoke-virtual {v0}, Lo/eyt$b;->e()V

    .line 94
    iget-object v0, p0, Lo/eyt$b$5;->b:Lo/eyt$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eyt$b;->c(ZZ)V

    .line 95
    return-void
.end method
