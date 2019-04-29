.class public final Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;
.super Ljava/lang/Object;
.source "DnaBehaviourHandler.kt"


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
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0015\u0010\r\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "(Lio/streamroot/dna/core/js/CallExecutor;)V",
        "updateDnaDownload",
        "",
        "allow",
        "",
        "updateDnaDownloadOnCellular",
        "(Ljava/lang/Boolean;)V",
        "updateDnaDownloadOnWifiEthernet",
        "updateDnaUpload",
        "updateDnaUploadOnCellular",
        "updateDnaUploadOnWifiEthernet",
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
.field private final callExecutor:Lio/streamroot/dna/core/js/CallExecutor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    return-void
.end method


# virtual methods
.method public final updateDnaDownload(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 19
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaDownload();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaDownload();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final updateDnaDownloadOnCellular(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 43
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.resetDnaDownloadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaDownloadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 45
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaDownloadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final updateDnaDownloadOnWifiEthernet(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 27
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.resetDnaDownloadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 28
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaDownloadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 29
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaDownloadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final updateDnaUpload(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 11
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaUpload();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaUpload();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final updateDnaUploadOnCellular(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 51
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.resetDnaUploadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaUploadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 53
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaUploadOnCellular();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final updateDnaUploadOnWifiEthernet(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 35
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.resetDnaUploadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 36
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.enableDnaUploadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v0, "Panama.disableDnaUploadOnWifiEthernet();"

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
