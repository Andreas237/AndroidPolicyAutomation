.class Lo/bxe$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxe;->c()Lo/egw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bxe;


# direct methods
.method constructor <init>(Lo/bxe;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/bxe$3;->d:Lo/bxe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 62
    iget-object v0, p0, Lo/bxe$3;->d:Lo/bxe;

    invoke-static {v0}, Lo/bxe;->b(Lo/bxe;)Lo/bxe$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/bxe$3;->d:Lo/bxe;

    invoke-static {v0}, Lo/bxe;->b(Lo/bxe;)Lo/bxe$b;

    move-result-object v0

    iget-object v1, p0, Lo/bxe$3;->d:Lo/bxe;

    invoke-static {v1}, Lo/bxe;->e(Lo/bxe;)Lo/bze;

    move-result-object v1

    invoke-virtual {v1}, Lo/bze;->getTime()I

    move-result v1

    invoke-interface {v0, v1}, Lo/bxe$b;->d(I)V

    .line 65
    :cond_0
    return-void
.end method
