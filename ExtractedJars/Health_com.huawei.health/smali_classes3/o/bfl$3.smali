.class Lo/bfl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfl;->e(Lo/bfp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bfp;

.field final synthetic b:Lo/bfl;


# direct methods
.method constructor <init>(Lo/bfl;Lo/bfp;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/bfl$3;->b:Lo/bfl;

    iput-object p2, p0, Lo/bfl$3;->a:Lo/bfp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 113
    iget-object v0, p0, Lo/bfl$3;->a:Lo/bfp;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lo/bfl$3;->a:Lo/bfp;

    iget-object v1, p0, Lo/bfl$3;->b:Lo/bfl;

    invoke-interface {v0, v1}, Lo/bfp;->c(Lo/bfl;)V

    .line 117
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
