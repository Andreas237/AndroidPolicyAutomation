.class Lo/buv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buv;->c(Lo/bvr;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/bvr;

.field final synthetic e:Lo/buv;


# direct methods
.method constructor <init>(Lo/buv;Lo/bvr;I)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/buv$3;->e:Lo/buv;

    iput-object p2, p0, Lo/buv$3;->d:Lo/bvr;

    iput p3, p0, Lo/buv$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 87
    iget-object v0, p0, Lo/buv$3;->e:Lo/buv;

    invoke-static {v0}, Lo/buv;->d(Lo/buv;)Lo/buv$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/buv$3;->e:Lo/buv;

    invoke-static {v0}, Lo/buv;->d(Lo/buv;)Lo/buv$b;

    move-result-object v0

    iget-object v1, p0, Lo/buv$3;->d:Lo/bvr;

    iget v2, p0, Lo/buv$3;->a:I

    iget-object v3, p0, Lo/buv$3;->e:Lo/buv;

    invoke-static {v3}, Lo/buv;->b(Lo/buv;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lo/buv$3;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/buv$b;->d(Lo/bvr;ILjava/lang/Object;)V

    .line 90
    :cond_0
    return-void
.end method
