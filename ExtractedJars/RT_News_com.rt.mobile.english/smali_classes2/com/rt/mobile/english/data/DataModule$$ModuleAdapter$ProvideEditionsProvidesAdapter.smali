.class public final Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;
.super Ldagger/internal/ProvidesBinding;
.source "DataModule$$ModuleAdapter.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProvideEditionsProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lcom/rt/mobile/english/data/EditionManager;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/rt/mobile/english/data/EditionManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/rt/mobile/english/data/DataModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/DataModule;)V
    .locals 4

    const-string v0, "com.rt.mobile.english.data.EditionManager"

    const-string v1, "com.rt.mobile.english.data.DataModule"

    const-string v2, "provideEditions"

    const/4 v3, 0x1

    .line 209
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 210
    iput-object p1, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    .line 211
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public get()Lcom/rt/mobile/english/data/EditionManager;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/DataModule;->provideEditions()Lcom/rt/mobile/english/data/EditionManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 204
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;->get()Lcom/rt/mobile/english/data/EditionManager;

    move-result-object v0

    return-object v0
.end method
