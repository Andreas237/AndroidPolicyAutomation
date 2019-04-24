.class Lo/ejw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ejw;->c(Lo/eih$n$a;Ljava/util/List;Lo/eih$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ejw;


# direct methods
.method constructor <init>(Lo/ejw;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lo/ejw$3;->e:Lo/ejw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 193
    iget-object v0, p0, Lo/ejw$3;->e:Lo/ejw;

    iget-object v1, p0, Lo/ejw$3;->e:Lo/ejw;

    invoke-virtual {v1}, Lo/ejw;->e()I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/ejw;->b(I)V

    .line 194
    iget-object v0, p0, Lo/ejw$3;->e:Lo/ejw;

    invoke-static {v0}, Lo/ejw;->a(Lo/ejw;)Lo/eih;

    move-result-object v0

    invoke-virtual {v0}, Lo/eih;->c()V

    .line 195
    return-void
.end method
