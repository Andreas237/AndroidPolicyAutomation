.class public abstract Lnet/hockeyapp/android/FeedbackManagerListener;
.super Ljava/lang/Object;
.source "FeedbackManagerListener.java"


# virtual methods
.method public abstract feedbackAnswered(Lnet/hockeyapp/android/objects/FeedbackMessage;)Z
.end method

.method public getFeedbackActivityClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lnet/hockeyapp/android/FeedbackActivity;",
            ">;"
        }
    .end annotation

    .line 18
    const-class v0, Lnet/hockeyapp/android/FeedbackActivity;

    return-object v0
.end method
