.class Lo/dtv$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dto;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dtv$3;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dtv$3;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lo/dtv$3;J)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iput-wide p2, p0, Lo/dtv$3$4;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 8

    .line 113
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFinished:resCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " contentType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget v2, v2, Lo/dtv$3;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 115
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->c:Lo/dtv;

    iget-object v1, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget v1, v1, Lo/dtv$3;->b:I

    invoke-static {v0, p1, p2, v1}, Lo/dtv;->b(Lo/dtv;ILjava/lang/String;I)V

    .line 116
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget v0, v0, Lo/dtv$3;->b:I

    const/16 v1, 0x9

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->c:Lo/dtv;

    iget-object v1, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v1, v1, Lo/dtv$3;->e:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lo/dtv;->c(Lo/dtv;ILjava/lang/String;)V

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget v0, v0, Lo/dtv$3;->b:I

    const/4 v1, 0x7

    if-ne v1, v0, :cond_1

    .line 119
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->c:Lo/dtv;

    invoke-static {v0, p1}, Lo/dtv;->d(Lo/dtv;I)V

    .line 121
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->c:Lo/dtv;

    iget-object v1, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget v1, v1, Lo/dtv$3;->b:I

    invoke-static {v0, p1, p2, v1}, Lo/dtv;->e(Lo/dtv;ILjava/lang/String;I)V

    .line 122
    iget-object v0, p0, Lo/dtv$3$4;->a:Lo/dtv$3;

    iget-object v0, v0, Lo/dtv$3;->c:Lo/dtv;

    move v1, p1

    iget-wide v2, p0, Lo/dtv$3$4;->c:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/dtv;->a(Lo/dtv;IJJ)V

    .line 123
    return-void
.end method
