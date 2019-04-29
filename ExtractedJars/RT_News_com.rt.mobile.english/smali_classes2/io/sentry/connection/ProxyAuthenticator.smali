.class public Lio/sentry/connection/ProxyAuthenticator;
.super Ljava/net/Authenticator;
.source "ProxyAuthenticator.java"


# instance fields
.field private pass:Ljava/lang/String;

.field private user:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    .line 20
    iput-object p1, p0, Lio/sentry/connection/ProxyAuthenticator;->user:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lio/sentry/connection/ProxyAuthenticator;->pass:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .locals 3

    .line 26
    invoke-virtual {p0}, Lio/sentry/connection/ProxyAuthenticator;->getRequestorType()Ljava/net/Authenticator$RequestorType;

    move-result-object v0

    sget-object v1, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    if-ne v0, v1, :cond_0

    .line 27
    new-instance v0, Ljava/net/PasswordAuthentication;

    iget-object v1, p0, Lio/sentry/connection/ProxyAuthenticator;->user:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/connection/ProxyAuthenticator;->pass:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
