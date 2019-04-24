.class Lo/eya$8;
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

    .line 280
    iput-object p1, p0, Lo/eya$8;->c:Lo/eya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)F
    .locals 2

    .line 284
    iget-object v0, p0, Lo/eya$8;->c:Lo/eya;

    invoke-static {v0}, Lo/eya;->e(Lo/eya;)Lo/eii;

    move-result-object v0

    if-nez v0, :cond_0

    .line 285
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateMax can\'t find dataSet"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 288
    :cond_0
    iget-object v0, p0, Lo/eya$8;->c:Lo/eya;

    invoke-static {v0}, Lo/eya;->e(Lo/eya;)Lo/eii;

    move-result-object v0

    new-instance v1, Lo/eya$8$5;

    invoke-direct {v1, p0}, Lo/eya$8$5;-><init>(Lo/eya$8;)V

    invoke-virtual {v0, p1, v1}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    move-result v0

    return v0
.end method
