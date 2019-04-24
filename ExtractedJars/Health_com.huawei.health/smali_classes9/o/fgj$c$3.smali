.class Lo/fgj$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fgj$c;->a()Lo/fgj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fgj$c;

.field final synthetic d:Lo/fgl;

.field final synthetic e:Lo/fgj;


# direct methods
.method constructor <init>(Lo/fgj$c;Lo/fgj;Lo/fgl;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/fgj$c$3;->a:Lo/fgj$c;

    iput-object p2, p0, Lo/fgj$c$3;->e:Lo/fgj;

    iput-object p3, p0, Lo/fgj$c$3;->d:Lo/fgl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 83
    iget-object v0, p0, Lo/fgj$c$3;->a:Lo/fgj$c;

    invoke-static {v0}, Lo/fgj$c;->c(Lo/fgj$c;)Lo/fgj$a;

    move-result-object v0

    iget-object v1, p0, Lo/fgj$c$3;->e:Lo/fgj;

    iget-object v2, p0, Lo/fgj$c$3;->d:Lo/fgl;

    .line 84
    invoke-virtual {v2}, Lo/fgl;->getSelectedFoot()I

    move-result v2

    iget-object v3, p0, Lo/fgj$c$3;->d:Lo/fgl;

    .line 85
    invoke-virtual {v3}, Lo/fgl;->getSelectedInch()I

    move-result v3

    .line 83
    const/4 v4, -0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lo/fgj$a;->d(Landroid/app/Dialog;III)V

    .line 86
    return-void
.end method
