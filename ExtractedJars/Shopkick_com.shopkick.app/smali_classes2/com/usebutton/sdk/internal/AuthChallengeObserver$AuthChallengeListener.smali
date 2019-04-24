.class public interface abstract Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;
.super Ljava/lang/Object;
.source "AuthChallengeObserver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/AuthChallengeObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AuthChallengeListener"
.end annotation


# virtual methods
.method public abstract onSSOAuth(Lcom/usebutton/sdk/internal/models/AuthChallenge;)V
.end method

.method public abstract onSuccess()V
.end method
