.class public Lo/fms;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fms$e;
    }
.end annotation


# instance fields
.field private a:Lo/fmw;

.field private final d:I

.field private e:Lo/fms$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fms$e<Ljava/net/InetAddress;Lo/fmu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/16 v0, 0xa

    iput v0, p0, Lo/fms;->d:I

    .line 32
    new-instance v0, Lo/fms$e;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lo/fms$e;-><init>(Lo/fms;I)V

    iput-object v0, p0, Lo/fms;->e:Lo/fms$e;

    .line 44
    iput-object p1, p0, Lo/fms;->a:Lo/fmw;

    .line 45
    return-void
.end method


# virtual methods
.method public c(Lo/fmb;)Lo/fmu;
    .locals 4

    .line 54
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->p()Ljava/net/InetAddress;

    move-result-object v1

    .line 55
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->m()I

    move-result v2

    .line 58
    iget-object v0, p0, Lo/fms;->e:Lo/fms$e;

    invoke-virtual {v0, v1}, Lo/fms$e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    new-instance v3, Lo/fmu;

    iget-object v0, p0, Lo/fms;->a:Lo/fmw;

    invoke-direct {v3, v2, v1, v0}, Lo/fmu;-><init>(ILjava/net/InetAddress;Lo/fmw;)V

    .line 60
    iget-object v0, p0, Lo/fms;->e:Lo/fms$e;

    invoke-virtual {v0, v1, v3}, Lo/fms$e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_0
    iget-object v0, p0, Lo/fms;->e:Lo/fms$e;

    invoke-virtual {v0, v1}, Lo/fms$e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu;

    return-object v0
.end method
