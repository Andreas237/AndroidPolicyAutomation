.class final Lo/cmv$1;
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
        "Lo/cmv$a<Lo/cmz;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 191
    invoke-direct {p0, p1}, Lo/cmv$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lo/cmo;)Lo/cmz;
    .locals 1

    .line 194
    invoke-static {p1, p2}, Lo/cmt;->e(Landroid/content/Context;Lo/cmo;)Lo/cmz;

    move-result-object v0

    return-object v0
.end method

.method protected d()V
    .locals 0

    .line 199
    invoke-static {}, Lo/cmt;->b()V

    .line 200
    return-void
.end method

.method protected synthetic e(Landroid/content/Context;Lo/cmo;)Ljava/lang/Object;
    .locals 1

    .line 191
    invoke-virtual {p0, p1, p2}, Lo/cmv$1;->a(Landroid/content/Context;Lo/cmo;)Lo/cmz;

    move-result-object v0

    return-object v0
.end method
