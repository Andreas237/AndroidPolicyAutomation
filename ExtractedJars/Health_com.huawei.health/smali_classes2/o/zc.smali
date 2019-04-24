.class public Lo/zc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lo/zc;->d:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lo/zc;->d:Ljava/util/Map;

    .line 45
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/zc;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/zc;->b:Ljava/lang/String;

    .line 35
    return-void
.end method
