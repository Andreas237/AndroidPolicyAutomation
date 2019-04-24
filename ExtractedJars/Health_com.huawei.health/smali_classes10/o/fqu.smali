.class public Lo/fqu;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final a:Ljava/net/InetSocketAddress;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    iput-object p2, p0, Lo/fqu;->a:Ljava/net/InetSocketAddress;

    .line 55
    return-void
.end method
