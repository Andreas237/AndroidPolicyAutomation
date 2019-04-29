.class public final Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;
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
    name = "ProvideStringRestAdapterProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lretrofit/RestAdapter;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lretrofit/RestAdapter;",
        ">;"
    }
.end annotation


# instance fields
.field private client:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lretrofit/client/Client;",
            ">;"
        }
    .end annotation
.end field

.field private endpoint:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lretrofit/Endpoint;",
            ">;"
        }
    .end annotation
.end field

.field private gson:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lcom/google/gson/Gson;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/rt/mobile/english/data/ApiModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/ApiModule;)V
    .locals 4

    const-string v0, "@javax.inject.Named(value=html)/retrofit.RestAdapter"

    const-string v1, "com.rt.mobile.english.data.ApiModule"

    const-string v2, "provideStringRestAdapter"

    const/4 v3, 0x1

    .line 251
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 252
    iput-object p1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    .line 253
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "retrofit.Endpoint"

    .line 263
    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->endpoint:Ldagger/internal/Binding;

    const-string v0, "retrofit.client.Client"

    .line 264
    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->client:Ldagger/internal/Binding;

    const-string v0, "com.google.gson.Gson"

    .line 265
    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->gson:Ldagger/internal/Binding;

    return-void
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 243
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->get()Lretrofit/RestAdapter;

    move-result-object v0

    return-object v0
.end method

.method public get()Lretrofit/RestAdapter;
    .locals 4

    .line 285
    iget-object v0, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    iget-object v1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->endpoint:Ldagger/internal/Binding;

    invoke-virtual {v1}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/Endpoint;

    iget-object v2, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->client:Ldagger/internal/Binding;

    invoke-virtual {v2}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lretrofit/client/Client;

    iget-object v3, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->gson:Ldagger/internal/Binding;

    invoke-virtual {v3}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/Gson;

    invoke-virtual {v0, v1, v2, v3}, Lcom/rt/mobile/english/data/ApiModule;->provideStringRestAdapter(Lretrofit/Endpoint;Lretrofit/client/Client;Lcom/google/gson/Gson;)Lretrofit/RestAdapter;

    move-result-object v0

    return-object v0
.end method

.method public getDependencies(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;)V"
        }
    .end annotation

    .line 274
    iget-object p2, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->endpoint:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 275
    iget-object p2, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->client:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 276
    iget-object p2, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;->gson:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
