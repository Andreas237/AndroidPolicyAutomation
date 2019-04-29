.class public final Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;
.super Ldagger/internal/ProvidesBinding;
.source "ApiModule$$ModuleAdapter.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProvideGsonProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lcom/google/gson/Gson;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/google/gson/Gson;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/rt/mobile/english/data/ApiModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/ApiModule;)V
    .locals 4

    const-string v0, "com.google.gson.Gson"

    const-string v1, "com.rt.mobile.english.data.ApiModule"

    const-string v2, "provideGson"

    const/4 v3, 0x1

    .line 162
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 163
    iput-object p1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    .line 164
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public get()Lcom/google/gson/Gson;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/ApiModule;->provideGson()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 157
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;->get()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method
