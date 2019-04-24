.class Lo/cid$a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cid$a;->c()Lo/cid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cid$a;

.field final synthetic c:Lo/ciu;

.field final synthetic e:Lo/cid;


# direct methods
.method constructor <init>(Lo/cid$a;Lo/cid;Lo/ciu;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/cid$a$5;->a:Lo/cid$a;

    iput-object p2, p0, Lo/cid$a$5;->e:Lo/cid;

    iput-object p3, p0, Lo/cid$a$5;->c:Lo/ciu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 91
    iget-object v0, p0, Lo/cid$a$5;->a:Lo/cid$a;

    invoke-static {v0}, Lo/cid$a;->b(Lo/cid$a;)Lo/cid$d;

    move-result-object v0

    iget-object v1, p0, Lo/cid$a$5;->e:Lo/cid;

    iget-object v2, p0, Lo/cid$a$5;->c:Lo/ciu;

    .line 92
    invoke-virtual {v2}, Lo/ciu;->getSelectedPosition()I

    move-result v2

    .line 91
    const/4 v3, -0x1

    invoke-interface {v0, v1, v3, v2}, Lo/cid$d;->c(Landroid/app/Dialog;II)V

    .line 93
    return-void
.end method
