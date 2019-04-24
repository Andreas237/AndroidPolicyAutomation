.class Lo/enr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enr;->b(Lo/enr$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lo/enr;


# direct methods
.method constructor <init>(Lo/enr;I)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/enr$4;->c:Lo/enr;

    iput p2, p0, Lo/enr$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 118
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-static {v0}, Lo/enr;->c(Lo/enr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-static {v0}, Lo/enr;->c(Lo/enr;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 118
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-static {v0}, Lo/enr;->c(Lo/enr;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/enr$4;->b:I

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-virtual {v0}, Lo/enr;->notifyDataSetChanged()V

    .line 123
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-static {v0}, Lo/enr;->b(Lo/enr;)Lo/enr$b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Lo/enr$4;->c:Lo/enr;

    invoke-static {v0}, Lo/enr;->b(Lo/enr;)Lo/enr$b;

    move-result-object v0

    iget v1, p0, Lo/enr$4;->b:I

    invoke-interface {v0, v1}, Lo/enr$b;->c(I)V

    .line 126
    :cond_1
    return-void
.end method
