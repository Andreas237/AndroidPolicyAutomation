.class Lo/exa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exa;->a(Lo/exa$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exa$c;

.field final synthetic b:Lo/exa;


# direct methods
.method constructor <init>(Lo/exa;Lo/exa$c;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/exa$1;->b:Lo/exa;

    iput-object p2, p0, Lo/exa$1;->a:Lo/exa$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 87
    iget-object v0, p0, Lo/exa$1;->b:Lo/exa;

    invoke-static {v0}, Lo/exa;->c(Lo/exa;)Lo/exa$e;

    move-result-object v0

    iget-object v1, p0, Lo/exa$1;->a:Lo/exa$c;

    iget-object v1, v1, Lo/exa$c;->itemView:Landroid/view/View;

    iget-object v2, p0, Lo/exa$1;->a:Lo/exa$c;

    invoke-virtual {v2}, Lo/exa$c;->getLayoutPosition()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/exa$e;->b(Landroid/view/View;I)V

    .line 88
    return-void
.end method
