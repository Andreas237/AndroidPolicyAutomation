.class Lo/egs$b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egs$b;->d()Lo/egs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egs;

.field final synthetic b:Lo/egs$b;


# direct methods
.method constructor <init>(Lo/egs$b;Lo/egs;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/egs$b$2;->b:Lo/egs$b;

    iput-object p2, p0, Lo/egs$b$2;->a:Lo/egs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 98
    iget-object v0, p0, Lo/egs$b$2;->b:Lo/egs$b;

    invoke-static {v0}, Lo/egs$b;->c(Lo/egs$b;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    iget-object v1, p0, Lo/egs$b$2;->a:Lo/egs;

    const/4 v2, -0x3

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 99
    return-void
.end method
