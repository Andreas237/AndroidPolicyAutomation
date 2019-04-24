.class Lo/alh$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alh;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/alh;


# direct methods
.method constructor <init>(Lo/alh;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/alh$5;->b:Lo/alh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 75
    iget-object v0, p0, Lo/alh$5;->b:Lo/alh;

    invoke-static {v0}, Lo/alh;->a(Lo/alh;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alh$5;->b:Lo/alh;

    invoke-static {v0}, Lo/alh;->a(Lo/alh;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/alh$5;->b:Lo/alh;

    invoke-static {v0}, Lo/alh;->b(Lo/alh;)V

    .line 78
    :cond_0
    return-void
.end method
