.class Lo/dfb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dfb$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfb;->e(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dfb;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lo/dfb;Z)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/dfb$5;->b:Lo/dfb;

    iput-boolean p2, p0, Lo/dfb$5;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/dfb$5;->b:Lo/dfb;

    invoke-static {v0}, Lo/dfb;->a(Lo/dfb;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dfb$5;->b:Lo/dfb;

    invoke-static {v0}, Lo/dfb;->c(Lo/dfb;)Lo/vl;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/dfb$5;->b:Lo/dfb;

    iget-boolean v1, p0, Lo/dfb$5;->c:Z

    invoke-static {v0, v1}, Lo/dfb;->d(Lo/dfb;Z)V

    .line 88
    :cond_0
    return-void
.end method
