.class Lo/eya$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eyv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eya;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eya;


# direct methods
.method constructor <init>(Lo/eya;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lo/eya$2;->c:Lo/eya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)F
    .locals 2

    .line 186
    iget-object v0, p0, Lo/eya$2;->c:Lo/eya;

    invoke-static {v0}, Lo/eya;->b(Lo/eya;)Lo/eii;

    move-result-object v0

    if-nez v0, :cond_0

    .line 187
    const/4 v0, 0x0

    return v0

    .line 190
    :cond_0
    iget-object v0, p0, Lo/eya$2;->c:Lo/eya;

    invoke-static {v0}, Lo/eya;->b(Lo/eya;)Lo/eii;

    move-result-object v0

    new-instance v1, Lo/eya$2$1;

    invoke-direct {v1, p0}, Lo/eya$2$1;-><init>(Lo/eya$2;)V

    invoke-virtual {v0, p1, v1}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    move-result v0

    return v0
.end method
