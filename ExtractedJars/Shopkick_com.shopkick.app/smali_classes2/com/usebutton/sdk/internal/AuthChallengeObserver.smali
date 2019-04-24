.class public Lcom/usebutton/sdk/internal/AuthChallengeObserver;
.super Ljava/lang/Object;
.source "AuthChallengeObserver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;
    }
.end annotation


# static fields
.field private static final OUR_INSTANCE:Lcom/usebutton/sdk/internal/AuthChallengeObserver;


# instance fields
.field private listener:Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->OUR_INSTANCE:Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/usebutton/sdk/internal/AuthChallengeObserver;
    .locals 1

    .line 12
    sget-object v0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->OUR_INSTANCE:Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    return-object v0
.end method


# virtual methods
.method onAuthSuccess()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->listener:Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;->onSuccess()V

    :cond_0
    return-void
.end method

.method onSSOAuth(Lcom/usebutton/sdk/internal/models/AuthChallenge;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->listener:Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;

    if-eqz v0, :cond_0

    .line 24
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;->onSSOAuth(Lcom/usebutton/sdk/internal/models/AuthChallenge;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->listener:Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;

    return-void
.end method
