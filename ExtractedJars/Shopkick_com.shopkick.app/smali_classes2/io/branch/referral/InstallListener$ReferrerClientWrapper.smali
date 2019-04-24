.class Lio/branch/referral/InstallListener$ReferrerClientWrapper;
.super Ljava/lang/Object;
.source "InstallListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/InstallListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReferrerClientWrapper"
.end annotation


# instance fields
.field private context_:Landroid/content/Context;

.field private mReferrerClient:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->context_:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lio/branch/referral/InstallListener$1;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$100(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Z
    .locals 0

    .line 91
    invoke-direct {p0}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->getReferrerUsingReferrerClient()Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Ljava/lang/Object;
    .locals 0

    .line 91
    iget-object p0, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->mReferrerClient:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$400(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Landroid/content/Context;
    .locals 0

    .line 91
    iget-object p0, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->context_:Landroid/content/Context;

    return-object p0
.end method

.method private getReferrerUsingReferrerClient()Z
    .locals 2

    .line 102
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->context_:Landroid/content/Context;

    invoke-static {v0}, Lcom/android/installreferrer/api/InstallReferrerClient;->newBuilder(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/installreferrer/api/InstallReferrerClient$Builder;->build()Lcom/android/installreferrer/api/InstallReferrerClient;

    move-result-object v0

    .line 103
    iput-object v0, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->mReferrerClient:Ljava/lang/Object;

    .line 104
    new-instance v1, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;

    invoke-direct {v1, p0}, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;-><init>(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)V

    invoke-virtual {v0, v1}, Lcom/android/installreferrer/api/InstallReferrerClient;->startConnection(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "BranchSDK"

    .line 145
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0
.end method
