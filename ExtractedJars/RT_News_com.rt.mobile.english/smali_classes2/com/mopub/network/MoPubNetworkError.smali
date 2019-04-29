.class public Lcom/mopub/network/MoPubNetworkError;
.super Lcom/mopub/volley/VolleyError;
.source "MoPubNetworkError.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/network/MoPubNetworkError$Reason;
    }
.end annotation


# instance fields
.field private final mReason:Lcom/mopub/network/MoPubNetworkError$Reason;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mRefreshTimeMillis:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 0
    .param p1    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0}, Lcom/mopub/volley/VolleyError;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lcom/mopub/volley/NetworkResponse;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 0
    .param p1    # Lcom/mopub/volley/NetworkResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Lcom/mopub/volley/NetworkResponse;)V

    .line 30
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/network/MoPubNetworkError;-><init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 52
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/String;)V

    .line 53
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 54
    iput-object p3, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    iput-object p3, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/network/MoPubNetworkError$Reason;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    .line 36
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getReason()Lcom/mopub/network/MoPubNetworkError$Reason;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->mReason:Lcom/mopub/network/MoPubNetworkError$Reason;

    return-object v0
.end method

.method public getRefreshTimeMillis()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->mRefreshTimeMillis:Ljava/lang/Integer;

    return-object v0
.end method
