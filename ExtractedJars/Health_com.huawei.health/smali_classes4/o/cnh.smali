.class public Lo/cnh;
.super Lo/abb$b;
.source "SourceFile"


# instance fields
.field private b:Lo/cmx;


# direct methods
.method public constructor <init>(Lo/cmx;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/abb$b;-><init>()V

    .line 12
    iput-object p1, p0, Lo/cnh;->b:Lo/cmx;

    .line 13
    return-void
.end method


# virtual methods
.method public d(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lo/cnh;->b:Lo/cmx;

    if-eqz v0, :cond_0

    .line 19
    iget-object v0, p0, Lo/cnh;->b:Lo/cmx;

    invoke-interface {v0, p1, p2}, Lo/cmx;->c(II)V

    .line 21
    :cond_0
    return-void
.end method
