.class public final Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;
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
    name = "ProvideChromeCastProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lcom/rt/mobile/english/ui/widget/ChromeCast;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/rt/mobile/english/ui/widget/ChromeCast;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/rt/mobile/english/data/DataModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/DataModule;)V
    .locals 4

    const-string v0, "com.rt.mobile.english.ui.widget.ChromeCast"

    const-string v1, "com.rt.mobile.english.data.DataModule"

    const-string v2, "provideChromeCast"

    const/4 v3, 0x1

    .line 286
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 287
    iput-object p1, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    .line 288
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public get()Lcom/rt/mobile/english/ui/widget/ChromeCast;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/DataModule;->provideChromeCast()Lcom/rt/mobile/english/ui/widget/ChromeCast;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 281
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;->get()Lcom/rt/mobile/english/ui/widget/ChromeCast;

    move-result-object v0

    return-object v0
.end method
