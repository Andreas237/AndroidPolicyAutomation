.class Lo/fey$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fey$c;->b()Lo/fey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fey;

.field final synthetic b:Lo/fey$c;

.field final synthetic d:Lo/fez;


# direct methods
.method constructor <init>(Lo/fey$c;Lo/fey;Lo/fez;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/fey$c$2;->b:Lo/fey$c;

    iput-object p2, p0, Lo/fey$c$2;->a:Lo/fey;

    iput-object p3, p0, Lo/fey$c$2;->d:Lo/fez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 104
    iget-object v0, p0, Lo/fey$c$2;->b:Lo/fey$c;

    invoke-static {v0}, Lo/fey$c;->e(Lo/fey$c;)Lo/fey$b;

    move-result-object v0

    iget-object v1, p0, Lo/fey$c$2;->a:Lo/fey;

    iget-object v2, p0, Lo/fey$c$2;->d:Lo/fez;

    .line 105
    invoke-virtual {v2}, Lo/fez;->getSelectedHour()I

    move-result v2

    iget-object v3, p0, Lo/fey$c$2;->d:Lo/fez;

    .line 106
    invoke-virtual {v3}, Lo/fez;->getSelectedMinute()I

    move-result v3

    .line 104
    const/4 v4, -0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lo/fey$b;->b(Landroid/app/Dialog;III)V

    .line 107
    return-void
.end method
