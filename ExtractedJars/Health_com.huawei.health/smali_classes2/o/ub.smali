.class public final Lo/ub;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/qr;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[Lo/ou;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/qr;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/qr;Ljava/util/List<[Lo/ou;>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lo/ub;->a:Lo/qr;

    .line 34
    iput-object p2, p0, Lo/ub;->e:Ljava/util/List;

    .line 35
    return-void
.end method


# virtual methods
.method public b()Lo/qr;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/ub;->a:Lo/qr;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[Lo/ou;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lo/ub;->e:Ljava/util/List;

    return-object v0
.end method
