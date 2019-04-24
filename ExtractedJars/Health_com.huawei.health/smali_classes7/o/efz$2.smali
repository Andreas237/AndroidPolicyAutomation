.class Lo/efz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efz;


# direct methods
.method constructor <init>(Lo/efz;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/efz$2;->a:Lo/efz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 251
    const/4 v2, 0x0

    .line 252
    const/4 v3, 0x0

    .line 253
    const/4 v4, 0x0

    .line 254
    const/4 v5, 0x0

    .line 255
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->d(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->d(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v2, v0, Lo/efo;->e:F

    .line 257
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->d(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v4, v0, Lo/efo;->d:F

    .line 259
    :cond_0
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->a(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->a(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v3, v0, Lo/efo;->e:F

    .line 261
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->a(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v5, v0, Lo/efo;->d:F

    .line 263
    :cond_1
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    iget-object v1, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Lo/efw;->e(FF)Lo/efo;

    move-result-object v1

    invoke-static {v0, v1}, Lo/efz;->d(Lo/efz;Lo/efo;)Lo/efo;

    .line 264
    iget-object v0, p0, Lo/efz$2;->a:Lo/efz;

    iget-object v1, p0, Lo/efz$2;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Lo/efw;->e(FF)Lo/efo;

    move-result-object v1

    invoke-static {v0, v1}, Lo/efz;->c(Lo/efz;Lo/efo;)Lo/efo;

    .line 267
    return-void
.end method
