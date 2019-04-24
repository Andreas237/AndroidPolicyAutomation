.class Lo/fez$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fez;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fez;


# direct methods
.method constructor <init>(Lo/fez;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/fez$5;->b:Lo/fez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->b(Lo/fez;I)I

    .line 71
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    iget v0, v0, Lo/fez;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 72
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->a(Lo/fez;I)I

    .line 73
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->c(Lo/fez;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->d(Lo/fez;)I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    .line 74
    invoke-static {v0}, Lo/fez;->c(Lo/fez;)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->d(Lo/fez;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 75
    :cond_1
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->a(Lo/fez;)I

    move-result v0

    if-nez v0, :cond_2

    .line 76
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->e(Lo/fez;)Lo/ffa;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 78
    :cond_2
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->e(Lo/fez;)Lo/ffa;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    .line 81
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    iget-object v1, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v1}, Lo/fez;->d(Lo/fez;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fez;->e(Lo/fez;I)I

    .line 82
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0}, Lo/fez;->b(Lo/fez;)V

    goto :goto_1

    .line 84
    :cond_4
    iget-object v0, p0, Lo/fez$5;->b:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->i(Lo/fez;I)I

    .line 86
    :goto_1
    return-void
.end method
