.class Lo/eyk$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eyl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyk;->c(Ljava/util/List;Lo/eyk$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eyk;


# direct methods
.method constructor <init>(Lo/eyk;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/eyk$5;->a:Lo/eyk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eyk$e;)V
    .locals 3

    .line 266
    iget-object v0, p0, Lo/eyk$5;->a:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->a(Lo/eyk;)Lo/faa;

    move-result-object v0

    iget-object v1, p0, Lo/eyk$5;->a:Lo/eyk;

    invoke-static {v1}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/faa;->setCurrentItem(I)V

    .line 267
    iget-object v0, p0, Lo/eyk$5;->a:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->d(Lo/eyk;)Lo/egl;

    move-result-object v0

    iget-object v1, p0, Lo/eyk$5;->a:Lo/eyk;

    iget-object v2, p0, Lo/eyk$5;->a:Lo/eyk;

    invoke-static {v2}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v1, v2}, Lo/eyk;->d(Lo/eyk;I)Lo/egl$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egl;->b(Lo/egl$c;)V

    .line 268
    return-void
.end method
