.class public abstract Lorg/jivesoftware/smack/AbstractConnectionClosedListener;
.super Lorg/jivesoftware/smack/AbstractConnectionListener;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lorg/jivesoftware/smack/AbstractConnectionListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final connectionClosed()V
    .locals 0

    .line 23
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractConnectionClosedListener;->connectionTerminated()V

    .line 24
    return-void
.end method

.method public final connectionClosedOnError(Ljava/lang/Exception;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractConnectionClosedListener;->connectionTerminated()V

    .line 29
    return-void
.end method

.method public abstract connectionTerminated()V
.end method
