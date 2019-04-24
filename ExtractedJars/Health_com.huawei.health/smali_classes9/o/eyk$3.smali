.class Lo/eyk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egl$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyk;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eyk;


# direct methods
.method constructor <init>(Lo/eyk;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/eyk$3;->c:Lo/eyk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/egl$c;Lo/egl$c;F)V
    .locals 2

    .line 139
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/eyk$3;->c:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->b(Lo/eyk;)Lo/eyl;

    move-result-object v0

    iget-object v1, p0, Lo/eyk$3;->c:Lo/eyk;

    invoke-static {v1, p2}, Lo/eyk;->a(Lo/eyk;Lo/egl$c;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyl;->c(I)V

    .line 144
    iget-object v0, p0, Lo/eyk$3;->c:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->a(Lo/eyk;)Lo/faa;

    move-result-object v0

    iget-object v1, p0, Lo/eyk$3;->c:Lo/eyk;

    invoke-static {v1, p2}, Lo/eyk;->a(Lo/eyk;Lo/egl$c;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/faa;->setCurrentItem(I)V

    .line 146
    :cond_0
    return-void
.end method
