.class public final Lio/streamroot/dna/core/transfer/DnaBehaviourService;
.super Ljava/lang/Object;
.source "DnaBehaviourService.kt"


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u001e\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR(\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u000e\"\u0004\u0008\u0015\u0010\u0010R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0019\u0010\t\"\u0004\u0008\u001a\u0010\u000bR(\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u000e\"\u0004\u0008\u001d\u0010\u0010R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R(\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u000e\"\u0004\u0008!\u0010\u0010R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/DnaBehaviourService;",
        "",
        "dnaBehaviourHandler",
        "Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;",
        "(Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;)V",
        "value",
        "",
        "dnaDownload",
        "getDnaDownload",
        "()Z",
        "setDnaDownload",
        "(Z)V",
        "dnaDownloadOnCellular",
        "getDnaDownloadOnCellular",
        "()Ljava/lang/Boolean;",
        "setDnaDownloadOnCellular",
        "(Ljava/lang/Boolean;)V",
        "dnaDownloadOnCellularValue",
        "Ljava/lang/Boolean;",
        "dnaDownloadOnWifiEthernet",
        "getDnaDownloadOnWifiEthernet",
        "setDnaDownloadOnWifiEthernet",
        "dnaDownloadOnWifiEthernetValue",
        "dnaDownloadValue",
        "dnaUpload",
        "getDnaUpload",
        "setDnaUpload",
        "dnaUploadOnCellular",
        "getDnaUploadOnCellular",
        "setDnaUploadOnCellular",
        "dnaUploadOnCellularValue",
        "dnaUploadOnWifiEthernet",
        "getDnaUploadOnWifiEthernet",
        "setDnaUploadOnWifiEthernet",
        "dnaUploadOnWifiEthernetValue",
        "dnaUploadValue",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

.field private dnaDownloadOnCellularValue:Ljava/lang/Boolean;

.field private dnaDownloadOnWifiEthernetValue:Ljava/lang/Boolean;

.field private dnaDownloadValue:Z

.field private dnaUploadOnCellularValue:Ljava/lang/Boolean;

.field private dnaUploadOnWifiEthernetValue:Ljava/lang/Boolean;

.field private dnaUploadValue:Z


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dnaBehaviourHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadValue:Z

    .line 10
    iput-boolean p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadValue:Z

    return-void
.end method


# virtual methods
.method public final getDnaDownload()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadValue:Z

    return v0
.end method

.method public final getDnaDownloadOnCellular()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 45
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadOnCellularValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDnaDownloadOnWifiEthernet()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 31
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadOnWifiEthernetValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDnaUpload()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadValue:Z

    return v0
.end method

.method public final getDnaUploadOnCellular()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 52
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadOnCellularValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDnaUploadOnWifiEthernet()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadOnWifiEthernetValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final setDnaDownload(Z)V
    .locals 1

    .line 19
    iput-boolean p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadValue:Z

    .line 20
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaDownload(Z)V

    return-void
.end method

.method public final setDnaDownloadOnCellular(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 47
    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadOnCellularValue:Ljava/lang/Boolean;

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaDownloadOnCellular(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final setDnaDownloadOnWifiEthernet(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 33
    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaDownloadOnWifiEthernetValue:Ljava/lang/Boolean;

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaDownloadOnWifiEthernet(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final setDnaUpload(Z)V
    .locals 1

    .line 26
    iput-boolean p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadValue:Z

    .line 27
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaUpload(Z)V

    return-void
.end method

.method public final setDnaUploadOnCellular(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 54
    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadOnCellularValue:Ljava/lang/Boolean;

    .line 55
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaUploadOnCellular(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final setDnaUploadOnWifiEthernet(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 40
    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaUploadOnWifiEthernetValue:Ljava/lang/Boolean;

    .line 41
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;->dnaBehaviourHandler:Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->updateDnaUploadOnWifiEthernet(Ljava/lang/Boolean;)V

    return-void
.end method
