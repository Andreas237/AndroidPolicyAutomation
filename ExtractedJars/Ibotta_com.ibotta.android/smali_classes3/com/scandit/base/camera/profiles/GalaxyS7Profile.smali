.class public Lcom/scandit/base/camera/profiles/GalaxyS7Profile;
.super Lcom/scandit/base/camera/profiles/PhaseAfProfile;
.source "GalaxyS7Profile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    const-string v0, "sm-g930f"

    .line 19
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sm-g930v"

    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
