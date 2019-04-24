.class Lo/frg$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fpo$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/frg;-><init>(IJLo/fsd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/fpo$e<Lo/fqq;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/frg;


# direct methods
.method constructor <init>(Lo/frg;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/frg$5;->a:Lo/frg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 119
    move-object v0, p1

    check-cast v0, Lo/fqq;

    invoke-virtual {p0, v0}, Lo/frg$5;->d(Lo/fqq;)V

    return-void
.end method

.method public d(Lo/fqq;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lo/frg$5;->a:Lo/frg;

    invoke-static {v0, p1}, Lo/frg;->a(Lo/frg;Lo/fqq;)V

    .line 124
    return-void
.end method
