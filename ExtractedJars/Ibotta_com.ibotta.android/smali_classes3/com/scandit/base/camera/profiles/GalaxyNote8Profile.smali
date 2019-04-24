.class public Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;
.super Lcom/scandit/base/camera/profiles/PhaseAfProfile;
.source "GalaxyNote8Profile.java"


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

    const-string v0, "sm-n950f"

    .line 19
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
