.class Lo/esl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/est$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esl;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lo/esl;Z)V
    .locals 0

    .line 581
    iput-object p1, p0, Lo/esl$4;->b:Lo/esl;

    iput-boolean p2, p0, Lo/esl$4;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 584
    iget-object v0, p0, Lo/esl$4;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->a(Lo/esl;)Lo/eso;

    move-result-object v0

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    invoke-virtual {v0}, Lo/est;->getTextLine()I

    move-result v4

    .line 585
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "textView checkCardText lineCount2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    iget-object v0, p0, Lo/esl$4;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->a(Lo/esl;)Lo/eso;

    move-result-object v0

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    invoke-virtual {v0}, Lo/est;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 587
    iget-boolean v0, p0, Lo/esl$4;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    if-le v4, v0, :cond_0

    .line 588
    iget-object v0, p0, Lo/esl$4;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->a(Lo/esl;)Lo/eso;

    move-result-object v0

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 591
    :cond_0
    return-void
.end method
