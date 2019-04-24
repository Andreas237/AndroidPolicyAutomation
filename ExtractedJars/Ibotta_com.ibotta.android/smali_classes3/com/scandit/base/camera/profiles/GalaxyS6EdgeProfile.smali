.class public Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;
.super Lcom/scandit/base/camera/profiles/PhaseAfProfile;
.source "GalaxyS6EdgeProfile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 13
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    const-string v0, "sm-g925f"

    .line 18
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
