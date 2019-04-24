.class final Lo/asr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asr;->c(Lo/asr;JLjava/util/ArrayList;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lo/asr;


# direct methods
.method constructor <init>(Lo/asr;JLjava/util/ArrayList;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/asr$5;->c:Lo/asr;

    iput-wide p2, p0, Lo/asr$5;->a:J

    iput-object p4, p0, Lo/asr$5;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 116
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/asr$5;->c:Lo/asr;

    iget-wide v2, p0, Lo/asr$5;->a:J

    iget-object v4, p0, Lo/asr$5;->b:Ljava/util/ArrayList;

    invoke-static {v1, v2, v3, v4}, Lo/asr;->e(Lo/asr;JLjava/util/ArrayList;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 117
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 122
    if-eqz p1, :cond_0

    .line 124
    iget-object v0, p0, Lo/asr$5;->c:Lo/asr;

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, p2, v2}, Lo/asr;->c(Lo/asr;IIILjava/lang/Object;)V

    .line 126
    :cond_0
    return-void
.end method
