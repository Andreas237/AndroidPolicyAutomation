.class public Lcom/ibotta/android/util/AppSemverImpl;
.super Ljava/lang/Object;
.source "AppSemverImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/AppSemver;


# instance fields
.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final semverFactory:Lcom/ibotta/android/util/SemverFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/util/AppSemverImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/util/AppSemverImpl;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    return-void
.end method


# virtual methods
.method public getSemver()Lcom/vdurmont/semver4j/Semver;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/util/AppSemverImpl;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    iget-object v1, p0, Lcom/ibotta/android/util/AppSemverImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/util/SemverFactory;->create(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;

    move-result-object v0

    return-object v0
.end method
