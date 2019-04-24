.class Lo/bxi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxi;->e()Lo/egw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bxi;


# direct methods
.method constructor <init>(Lo/bxi;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/bxi$2;->b:Lo/bxi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 60
    iget-object v0, p0, Lo/bxi$2;->b:Lo/bxi;

    invoke-static {v0}, Lo/bxi;->e(Lo/bxi;)Lo/bxi$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/bxi$2;->b:Lo/bxi;

    invoke-static {v0}, Lo/bxi;->e(Lo/bxi;)Lo/bxi$e;

    move-result-object v0

    iget-object v1, p0, Lo/bxi$2;->b:Lo/bxi;

    invoke-static {v1}, Lo/bxi;->c(Lo/bxi;)Lo/eha;

    move-result-object v1

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bxi$e;->e(Ljava/lang/String;)V

    .line 63
    :cond_0
    return-void
.end method
