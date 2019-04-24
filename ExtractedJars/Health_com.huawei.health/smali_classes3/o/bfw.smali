.class public Lo/bfw;
.super Lo/bfn;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/bfn;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;I)Lo/bfk;
    .locals 4

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 28
    new-instance v3, Lo/bfx;

    invoke-direct {v3, p1}, Lo/bfx;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "ContactNodeFactory"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Don\'t support card type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :goto_0
    return-object v3
.end method
