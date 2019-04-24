.class Lo/fgj$c$4;
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
.field final synthetic b:Lo/fgj$c;

.field final synthetic d:Lo/fgj;


# direct methods
.method constructor <init>(Lo/fgj$c;Lo/fgj;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/fgj$c$4;->b:Lo/fgj$c;

    iput-object p2, p0, Lo/fgj$c$4;->d:Lo/fgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 92
    iget-object v0, p0, Lo/fgj$c$4;->b:Lo/fgj$c;

    invoke-static {v0}, Lo/fgj$c;->e(Lo/fgj$c;)Lo/fgj$a;

    move-result-object v0

    iget-object v1, p0, Lo/fgj$c$4;->d:Lo/fgj;

    const/4 v2, -0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lo/fgj$a;->d(Landroid/app/Dialog;III)V

    .line 94
    return-void
.end method
