.class Lo/ezh$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezh;->a(Lo/egl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ezh;


# direct methods
.method constructor <init>(Lo/ezh;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 128
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->b:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->a(Lo/egl$c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->b:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->c(Lo/egl$c;)V

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->e:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->a(Lo/egl$c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->e:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->c(Lo/egl$c;)V

    goto :goto_0

    .line 137
    :cond_1
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->a:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->a(Lo/egl$c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    iget-object v0, p0, Lo/ezh$1;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->c(Lo/ezh;)Lo/egl;

    move-result-object v0

    sget-object v1, Lo/egl$c;->a:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->c(Lo/egl$c;)V

    .line 142
    :cond_2
    :goto_0
    return-void
.end method
