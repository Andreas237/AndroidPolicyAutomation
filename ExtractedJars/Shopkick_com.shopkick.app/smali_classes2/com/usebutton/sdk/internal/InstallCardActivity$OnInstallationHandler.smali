.class Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;
.super Ljava/lang/Object;
.source "InstallCardActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Receiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/InstallCardActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnInstallationHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Receiver<",
        "Landroid/content/pm/PackageInfo;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "InstallCardActivity$OnInstallationHandler"


# instance fields
.field private final mPackageName:Ljava/lang/String;

.field private mPerformer:Lcom/usebutton/sdk/internal/PostInstaller;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/PostInstaller;)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->mPackageName:Ljava/lang/String;

    .line 177
    iput-object p2, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->mPerformer:Lcom/usebutton/sdk/internal/PostInstaller;

    return-void
.end method

.method private onInstallation()V
    .locals 2

    .line 188
    sget-object v0, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->TAG:Ljava/lang/String;

    const-string v1, "Application installed, open action."

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/util/PackageObserver;->removeObserver(Lcom/usebutton/sdk/internal/util/Receiver;)V

    .line 190
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->mPerformer:Lcom/usebutton/sdk/internal/PostInstaller;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/PostInstaller;->onInstalled()V

    return-void
.end method


# virtual methods
.method public receive(Landroid/content/pm/PackageInfo;)V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->mPackageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 183
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->onInstallation()V

    :cond_0
    return-void
.end method

.method public bridge synthetic receive(Ljava/lang/Object;)V
    .locals 0

    .line 169
    check-cast p1, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;->receive(Landroid/content/pm/PackageInfo;)V

    return-void
.end method
