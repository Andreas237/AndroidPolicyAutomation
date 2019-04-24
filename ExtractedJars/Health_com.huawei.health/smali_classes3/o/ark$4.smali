.class final Lo/ark$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ark;->d(JLo/ark;I)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ark;

.field final synthetic b:I

.field final synthetic c:J


# direct methods
.method constructor <init>(JLo/ark;I)V
    .locals 0

    .line 285
    iput-wide p1, p0, Lo/ark$4;->c:J

    iput-object p3, p0, Lo/ark$4;->a:Lo/ark;

    iput p4, p0, Lo/ark$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 289
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-wide v1, p0, Lo/ark$4;->c:J

    iget-object v3, p0, Lo/ark$4;->a:Lo/ark;

    iget v4, p0, Lo/ark$4;->b:I

    invoke-static {v1, v2, v3, v4}, Lo/ark;->a(JLo/ark;I)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 290
    return-void
.end method

.method public e(II)V
    .locals 4

    .line 295
    const-string v0, "AssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request assistant info failed, login error, rc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", rtc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    move v3, p1

    .line 297
    if-nez v3, :cond_0

    .line 299
    move v3, p2

    .line 301
    :cond_0
    iget-object v0, p0, Lo/ark$4;->a:Lo/ark;

    const/16 v1, 0x202

    invoke-static {v0, v1, v3}, Lo/ark;->d(Lo/ark;II)V

    .line 302
    return-void
.end method
