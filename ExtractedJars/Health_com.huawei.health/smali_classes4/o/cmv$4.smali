.class final Lo/cmv$4;
.super Lo/cmv$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cmv$a<Lo/cnc;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 177
    invoke-direct {p0, p1}, Lo/cmv$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Lo/cmo;)Lo/cnc;
    .locals 1

    .line 181
    invoke-static {p1, p2}, Lo/cna;->b(Landroid/content/Context;Lo/cmo;)Lo/cnc;

    move-result-object v0

    return-object v0
.end method

.method protected d()V
    .locals 0

    .line 186
    invoke-static {}, Lo/cna;->i()V

    .line 187
    return-void
.end method

.method public synthetic e(Landroid/content/Context;Lo/cmo;)Ljava/lang/Object;
    .locals 1

    .line 177
    invoke-virtual {p0, p1, p2}, Lo/cmv$4;->c(Landroid/content/Context;Lo/cmo;)Lo/cnc;

    move-result-object v0

    return-object v0
.end method
