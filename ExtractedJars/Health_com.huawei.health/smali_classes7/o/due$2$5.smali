.class Lo/due$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dua;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/due$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/due$2;


# direct methods
.method constructor <init>(Lo/due$2;J)V
    .locals 0

    .line 258
    iput-object p1, p0, Lo/due$2$5;->b:Lo/due$2;

    iput-wide p2, p0, Lo/due$2$5;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 8

    .line 260
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download resCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v2, v2, Lo/due$2;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 262
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 263
    iget-object v0, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v0, v0, Lo/due$2;->c:Lo/due;

    iget-object v1, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v1, v1, Lo/due$2;->a:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lo/due;->e(Lo/due;ILjava/lang/Object;)V

    .line 265
    :cond_0
    iget-object v0, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v0, v0, Lo/due$2;->a:Ljava/lang/String;

    iget-object v1, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v1, v1, Lo/due$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v0, v0, Lo/due$2;->c:Lo/due;

    const-string v1, ""

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lo/due;->e(Lo/due;ILjava/lang/Object;)V

    .line 268
    :cond_1
    iget-object v0, p0, Lo/due$2$5;->b:Lo/due$2;

    iget-object v0, v0, Lo/due$2;->c:Lo/due;

    move v1, p1

    iget-wide v2, p0, Lo/due$2$5;->a:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/due;->a(Lo/due;IJJ)V

    .line 269
    return-void
.end method
