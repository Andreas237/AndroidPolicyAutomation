.class public abstract Lo/fpy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fqm;


# instance fields
.field private final c:Ljava/net/InetSocketAddress;


# direct methods
.method protected constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    if-nez p1, :cond_0

    .line 29
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_0
    iput-object p1, p0, Lo/fpy;->c:Ljava/net/InetSocketAddress;

    .line 32
    return-void
.end method


# virtual methods
.method public final e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/fpy;->c:Ljava/net/InetSocketAddress;

    return-object v0
.end method
