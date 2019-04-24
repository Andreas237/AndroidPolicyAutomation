.class Lo/cwc$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->c(Lo/cez;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 913
    iput-object p1, p0, Lo/cwc$14;->a:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(II)V
    .locals 1

    .line 916
    iget-object v0, p0, Lo/cwc$14;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->i(Lo/cwc;)Lo/cez;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 917
    iget-object v0, p0, Lo/cwc$14;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->i(Lo/cwc;)Lo/cez;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/cez;->e(II)V

    .line 919
    :cond_0
    return-void
.end method
