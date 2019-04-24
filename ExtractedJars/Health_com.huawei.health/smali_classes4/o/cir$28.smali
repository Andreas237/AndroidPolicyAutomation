.class Lo/cir$28;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/chh$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lo/cir$28;->e:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 453
    iget-object v0, p0, Lo/cir$28;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->h(Lo/cir;)V

    .line 454
    return-void
.end method

.method public c()V
    .locals 4

    .line 463
    iget-object v0, p0, Lo/cir$28;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->g(Lo/cir;)V

    .line 464
    iget-object v0, p0, Lo/cir$28;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->f(Lo/cir;)Lo/cir$e;

    move-result-object v0

    const/16 v1, 0x65

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Lo/cir$e;->sendEmptyMessageDelayed(IJ)Z

    .line 465
    iget-object v0, p0, Lo/cir$28;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/cbu;->h(I)V

    .line 466
    return-void
.end method

.method public d()V
    .locals 2

    .line 458
    iget-object v0, p0, Lo/cir$28;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cbu;->h(I)V

    .line 459
    return-void
.end method
