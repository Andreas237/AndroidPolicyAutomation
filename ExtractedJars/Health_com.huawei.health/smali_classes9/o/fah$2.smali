.class Lo/fah$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fal$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fah;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fah;


# direct methods
.method constructor <init>(Lo/fah;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/fah$2;->c:Lo/fah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(F)V
    .locals 2

    .line 73
    iget-object v0, p0, Lo/fah$2;->c:Lo/fah;

    invoke-static {v0}, Lo/fah;->c(Lo/fah;)Lo/fah$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/fah$2;->c:Lo/fah;

    invoke-static {v0}, Lo/fah;->c(Lo/fah;)Lo/fah$d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fah$d;->e(F)V

    .line 76
    :cond_0
    return-void
.end method
