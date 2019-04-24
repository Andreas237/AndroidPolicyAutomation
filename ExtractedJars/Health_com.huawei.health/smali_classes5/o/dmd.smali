.class public abstract Lo/dmd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, "SMART_SmartHttpCallback"

    iput-object v0, p0, Lo/dmd;->a:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITR;)V"
        }
    .end annotation

    .line 32
    invoke-virtual {p0, p1, p2}, Lo/dmd;->d(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p0, p2}, Lo/dmd;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lo/dmd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "request ressponse from server failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    :goto_0
    return-void
.end method

.method protected b(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 42
    invoke-virtual {p0, p1}, Lo/dmd;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {p0, p1}, Lo/dmd;->e(Ljava/lang/Object;)V

    .line 45
    return-void

    .line 48
    :cond_0
    iget-object v0, p0, Lo/dmd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activities don\'t satisfied trigger condition"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    return-void
.end method

.method protected abstract d(ILjava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITR;)Z"
        }
    .end annotation
.end method

.method protected abstract d(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)Z"
        }
    .end annotation
.end method

.method protected abstract e(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation
.end method
