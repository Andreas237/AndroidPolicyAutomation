.class Lo/ffr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fft;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffr;->d(Ljava/util/List;Lo/ffv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Lo/ffu;

.field final synthetic d:Lo/ffv;

.field final synthetic e:Lo/ffr;


# direct methods
.method constructor <init>(Lo/ffr;Lo/ffu;Lo/ffv;J)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/ffr$3;->e:Lo/ffr;

    iput-object p2, p0, Lo/ffr$3;->c:Lo/ffu;

    iput-object p3, p0, Lo/ffr$3;->d:Lo/ffv;

    iput-wide p4, p0, Lo/ffr$3;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/String;)V
    .locals 9

    .line 243
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doDownload:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "resCode = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 245
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "success"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/ffr$3;->e:Lo/ffr;

    invoke-static {v0}, Lo/ffr;->c(Lo/ffr;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ffy;->e(Landroid/content/Context;)Lo/ffy;

    move-result-object v0

    iget-object v1, p0, Lo/ffr$3;->c:Lo/ffu;

    iget-object v2, p0, Lo/ffr$3;->d:Lo/ffv;

    invoke-virtual {v0, v1, v2}, Lo/ffy;->e(Lo/ffu;Lo/ffv;)V

    goto :goto_0

    .line 248
    :cond_0
    iget-object v0, p0, Lo/ffr$3;->c:Lo/ffu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 249
    iget-object v0, p0, Lo/ffr$3;->d:Lo/ffv;

    iget-object v1, p0, Lo/ffr$3;->c:Lo/ffu;

    invoke-virtual {v1}, Lo/ffu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x4

    invoke-interface {v0, v1, v2}, Lo/ffv;->d(Ljava/lang/String;I)V

    goto :goto_0

    .line 251
    :cond_1
    iget-object v0, p0, Lo/ffr$3;->d:Lo/ffv;

    const-string v1, ""

    const/4 v2, -0x4

    invoke-interface {v0, v1, v2}, Lo/ffv;->d(Ljava/lang/String;I)V

    .line 254
    :goto_0
    iget-object v0, p0, Lo/ffr$3;->c:Lo/ffu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 255
    iget-object v0, p0, Lo/ffr$3;->e:Lo/ffr;

    move v1, p1

    iget-wide v2, p0, Lo/ffr$3;->a:J

    move-wide v4, v7

    iget-object v6, p0, Lo/ffr$3;->c:Lo/ffu;

    invoke-virtual {v6}, Lo/ffu;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/ffr;->c(Lo/ffr;IJJLjava/lang/String;)V

    .line 257
    :cond_2
    return-void
.end method
