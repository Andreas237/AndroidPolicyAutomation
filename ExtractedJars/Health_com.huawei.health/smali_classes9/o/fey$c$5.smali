.class Lo/fey$c$5;
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
.field final synthetic d:Lo/fey;

.field final synthetic e:Lo/fey$c;


# direct methods
.method constructor <init>(Lo/fey$c;Lo/fey;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lo/fey$c$5;->e:Lo/fey$c;

    iput-object p2, p0, Lo/fey$c$5;->d:Lo/fey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 113
    iget-object v0, p0, Lo/fey$c$5;->e:Lo/fey$c;

    invoke-static {v0}, Lo/fey$c;->b(Lo/fey$c;)Lo/fey$b;

    move-result-object v0

    iget-object v1, p0, Lo/fey$c$5;->d:Lo/fey;

    const/4 v2, -0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lo/fey$b;->b(Landroid/app/Dialog;III)V

    .line 115
    return-void
.end method
