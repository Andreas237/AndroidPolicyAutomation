.class Lo/egz$d$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egz$d;->e()Lo/egz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egz;

.field final synthetic e:Lo/egz$d;


# direct methods
.method constructor <init>(Lo/egz$d;Lo/egz;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/egz$d$4;->e:Lo/egz$d;

    iput-object p2, p0, Lo/egz$d$4;->a:Lo/egz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 99
    iget-object v0, p0, Lo/egz$d$4;->e:Lo/egz$d;

    invoke-static {v0}, Lo/egz$d;->a(Lo/egz$d;)Lo/egz$c;

    move-result-object v0

    iget-object v1, p0, Lo/egz$d$4;->a:Lo/egz;

    .line 100
    invoke-static {}, Lo/egz;->e()I

    move-result v2

    invoke-static {}, Lo/egz;->c()Ljava/lang/String;

    move-result-object v3

    .line 99
    const/4 v4, -0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lo/egz$c;->onClick(Landroid/app/Dialog;IILjava/lang/String;)V

    .line 101
    return-void
.end method
