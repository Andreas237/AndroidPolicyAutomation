.class public Lio/branch/referral/BranchContentUrlBuilder;
.super Lio/branch/referral/BranchUrlBuilder;
.source "BranchContentUrlBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/branch/referral/BranchUrlBuilder<",
        "Lio/branch/referral/BranchContentUrlBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lio/branch/referral/BranchUrlBuilder;-><init>(Landroid/content/Context;)V

    .line 12
    iput-object p2, p0, Lio/branch/referral/BranchContentUrlBuilder;->channel_:Ljava/lang/String;

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lio/branch/referral/BranchContentUrlBuilder;->type_:I

    const-string/jumbo p1, "share"

    .line 14
    iput-object p1, p0, Lio/branch/referral/BranchContentUrlBuilder;->feature_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public generateContentUrl(Lio/branch/referral/Branch$BranchLinkCreateListener;)V
    .locals 0

    .line 34
    invoke-super {p0, p1}, Lio/branch/referral/BranchUrlBuilder;->generateUrl(Lio/branch/referral/Branch$BranchLinkCreateListener;)V

    return-void
.end method

.method public getContentUrl()Ljava/lang/String;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lio/branch/referral/BranchContentUrlBuilder;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
