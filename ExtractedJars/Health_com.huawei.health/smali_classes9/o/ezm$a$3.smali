.class Lo/ezm$a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezm$a;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ezm$a;


# direct methods
.method constructor <init>(Lo/ezm$a;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lo/ezm$a$3;->b:Lo/ezm$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fbm;>;)V"
        }
    .end annotation

    .line 344
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 345
    :cond_0
    iget-object v0, p0, Lo/ezm$a$3;->b:Lo/ezm$a;

    invoke-static {v0}, Lo/ezm$a;->d(Lo/ezm$a;)Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 347
    :cond_1
    iget-object v0, p0, Lo/ezm$a$3;->b:Lo/ezm$a;

    invoke-static {v0}, Lo/ezm$a;->d(Lo/ezm$a;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 349
    :goto_0
    return-void
.end method
