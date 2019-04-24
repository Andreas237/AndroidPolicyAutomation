.class public Lcom/ibotta/android/state/session/SessionStateImpl;
.super Ljava/lang/Object;
.source "SessionStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/session/SessionState;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private sessionId:J


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 7
    iput-wide v0, p0, Lcom/ibotta/android/state/session/SessionStateImpl;->sessionId:J

    .line 10
    iput-object p1, p0, Lcom/ibotta/android/state/session/SessionStateImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public generateSessionId()V
    .locals 2

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/state/session/SessionStateImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/state/session/SessionStateImpl;->sessionId:J

    return-void
.end method

.method public getSessionId()J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/ibotta/android/state/session/SessionStateImpl;->sessionId:J

    return-wide v0
.end method
