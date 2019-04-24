.class public Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;
.super Lcom/scandit/base/camera/profiles/GalaxyS7Profile;
.source "GalaxyS6EdgeProfile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    .line 20
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SM-G925F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
