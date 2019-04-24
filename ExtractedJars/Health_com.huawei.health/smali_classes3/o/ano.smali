.class public abstract Lo/ano;
.super Lo/ank;
.source "SourceFile"


# instance fields
.field e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Lo/ank;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ano;->e:Ljava/util/Map;

    .line 29
    if-eqz p1, :cond_0

    .line 30
    iput-object p1, p0, Lo/ano;->e:Ljava/util/Map;

    .line 32
    :cond_0
    invoke-virtual {p0}, Lo/ano;->a()V

    .line 33
    return-void
.end method
