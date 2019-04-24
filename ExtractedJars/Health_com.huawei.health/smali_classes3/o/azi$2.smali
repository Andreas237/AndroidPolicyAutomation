.class Lo/azi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/azq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/azi;


# direct methods
.method constructor <init>(Lo/azi;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/azi$2;->b:Lo/azi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 106
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    sget-object v1, Lo/azd$c;->b:Lo/azd$c;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/azf;->b(Lo/azd$c;Lo/azd$a;)V

    .line 107
    return-void
.end method

.method public b()V
    .locals 3

    .line 89
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    sget-object v1, Lo/azd$c;->b:Lo/azd$c;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/azf;->b(Lo/azd$c;Lo/azd$a;)V

    .line 91
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->e(Lo/azi;)Lo/azo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/azo;->d(Z)V

    .line 92
    return-void
.end method

.method public c(Lo/azd$a;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/azf;->c(Lo/azd$a;)V

    .line 113
    return-void
.end method

.method public d()V
    .locals 3

    .line 97
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->b(Lo/azi;)Lo/azf;

    move-result-object v0

    sget-object v1, Lo/azd$c;->e:Lo/azd$c;

    sget-object v2, Lo/azd$a;->c:Lo/azd$a;

    invoke-interface {v0, v1, v2}, Lo/azf;->b(Lo/azd$c;Lo/azd$a;)V

    .line 99
    iget-object v0, p0, Lo/azi$2;->b:Lo/azi;

    invoke-static {v0}, Lo/azi;->e(Lo/azi;)Lo/azo;

    move-result-object v0

    invoke-virtual {v0}, Lo/azo;->b()V

    .line 100
    return-void
.end method
