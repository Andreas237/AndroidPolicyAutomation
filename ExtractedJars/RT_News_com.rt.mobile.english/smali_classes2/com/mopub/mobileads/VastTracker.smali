.class public Lcom/mopub/mobileads/VastTracker;
.super Ljava/lang/Object;
.source "VastTracker.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private mCalled:Z

.field private mIsRepeatable:Z

.field protected final mTrackingUrl:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    iput-object p1, p0, Lcom/mopub/mobileads/VastTracker;->mTrackingUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastTracker;-><init>(Ljava/lang/String;)V

    .line 26
    iput-boolean p2, p0, Lcom/mopub/mobileads/VastTracker;->mIsRepeatable:Z

    return-void
.end method


# virtual methods
.method public getTrackingUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/mopub/mobileads/VastTracker;->mTrackingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public isRepeatable()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastTracker;->mIsRepeatable:Z

    return v0
.end method

.method public isTracked()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastTracker;->mCalled:Z

    return v0
.end method

.method public setTracked()V
    .locals 1

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/mopub/mobileads/VastTracker;->mCalled:Z

    return-void
.end method
