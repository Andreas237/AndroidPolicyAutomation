.class public abstract Lo/ob;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/om;


# direct methods
.method protected constructor <init>(Lo/om;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lo/ob;->b:Lo/om;

    .line 36
    return-void
.end method


# virtual methods
.method public final a()Lo/om;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/ob;->b:Lo/om;

    return-object v0
.end method

.method public abstract a(ILo/qm;)Lo/qm;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation
.end method

.method public abstract b()Lo/qr;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation
.end method

.method public final d()I
    .locals 1

    .line 84
    iget-object v0, p0, Lo/ob;->b:Lo/om;

    invoke-virtual {v0}, Lo/om;->getHeight()I

    move-result v0

    return v0
.end method

.method public abstract d(Lo/om;)Lo/ob;
.end method

.method public final e()I
    .locals 1

    .line 80
    iget-object v0, p0, Lo/ob;->b:Lo/om;

    invoke-virtual {v0}, Lo/om;->getWidth()I

    move-result v0

    return v0
.end method
