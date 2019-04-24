.class Lo/duc$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dua;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/duc$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Lo/duc$2;


# direct methods
.method constructor <init>(Lo/duc$2;J)V
    .locals 0

    .line 354
    iput-object p1, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iput-wide p2, p0, Lo/duc$2$4;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 8

    .line 357
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 358
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 359
    iget-object v0, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v0, v0, Lo/duc$2;->k:Lo/duc;

    iget-object v1, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v1, v1, Lo/duc$2;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v2, v2, Lo/duc$2;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lo/duc;->d(Lo/duc;ILjava/lang/Object;)V

    .line 362
    :cond_0
    iget-object v0, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v0, v0, Lo/duc$2;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v1, v1, Lo/duc$2;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v0, v0, Lo/duc$2;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v1, v1, Lo/duc$2;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    iget-object v0, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v0, v0, Lo/duc$2;->k:Lo/duc;

    const-string v1, ""

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lo/duc;->d(Lo/duc;ILjava/lang/Object;)V

    .line 365
    :cond_1
    iget-object v0, p0, Lo/duc$2$4;->c:Lo/duc$2;

    iget-object v0, v0, Lo/duc$2;->k:Lo/duc;

    move v1, p1

    iget-wide v2, p0, Lo/duc$2$4;->a:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/duc;->b(Lo/duc;IJJ)V

    .line 366
    return-void
.end method
