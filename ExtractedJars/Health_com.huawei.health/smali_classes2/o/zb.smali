.class public Lo/zb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 70
    iput-object p1, p0, Lo/zb;->c:Ljava/util/Set;

    .line 71
    return-void
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lo/zb;->c:Ljava/util/Set;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/zb;->e:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/zb;->a:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/zb;->d:Ljava/lang/String;

    .line 51
    return-void
.end method
