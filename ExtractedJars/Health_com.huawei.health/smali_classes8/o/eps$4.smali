.class Lo/eps$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eps;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eps;


# direct methods
.method constructor <init>(Lo/eps;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/eps$4;->c:Lo/eps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/eps$4;->c:Lo/eps;

    invoke-static {v0}, Lo/eps;->b(Lo/eps;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/eps$4;->c:Lo/eps;

    iget-object v1, p0, Lo/eps$4;->c:Lo/eps;

    invoke-static {v1}, Lo/eps;->a(Lo/eps;)I

    move-result v1

    invoke-static {v0, p2, v1}, Lo/eps;->c(Lo/eps;II)V

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lo/eps$4;->c:Lo/eps;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Lo/eps;->c(Lo/eps;II)V

    .line 57
    :goto_0
    iget-object v0, p0, Lo/eps$4;->c:Lo/eps;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eps;->a(Lo/eps;Z)Z

    .line 58
    return-void
.end method
