.class public abstract Lorg/jivesoftware/smack/XMPPException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/XMPPException$StreamErrorException;,
        Lorg/jivesoftware/smack/XMPPException$FailedNonzaException;,
        Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5f8089b3520ec431L


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 49
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 58
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    return-void
.end method
