.class Lo/ffq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ffq;


# direct methods
.method constructor <init>(Lo/ffq;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/ffq$1;->a:Lo/ffq;

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

    .line 71
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->d(Lo/ffq;I)I

    .line 72
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    iget v0, v0, Lo/ffq;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 73
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->e(Lo/ffq;I)I

    .line 74
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->d(Lo/ffq;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->a(Lo/ffq;)I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->d(Lo/ffq;)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->a(Lo/ffq;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 76
    :cond_1
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->b(Lo/ffq;)I

    move-result v0

    if-nez v0, :cond_2

    .line 77
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->e(Lo/ffq;)Lo/ffa;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->e(Lo/ffq;)Lo/ffa;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    .line 83
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    iget-object v1, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v1}, Lo/ffq;->a(Lo/ffq;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ffq;->c(Lo/ffq;I)I

    .line 84
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->c(Lo/ffq;)V

    goto :goto_1

    .line 86
    :cond_4
    iget-object v0, p0, Lo/ffq$1;->a:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->k(Lo/ffq;I)I

    .line 88
    :goto_1
    return-void
.end method
