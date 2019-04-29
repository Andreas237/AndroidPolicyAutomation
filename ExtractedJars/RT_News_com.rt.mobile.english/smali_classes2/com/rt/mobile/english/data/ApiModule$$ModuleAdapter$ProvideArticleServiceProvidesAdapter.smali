.class public final Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;
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
    name = "ProvideArticleServiceProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lcom/rt/mobile/english/data/articles/ArticlesService;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/rt/mobile/english/data/articles/ArticlesService;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/rt/mobile/english/data/ApiModule;

.field private restAdapter:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lretrofit/RestAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/ApiModule;)V
    .locals 4

    const-string v0, "com.rt.mobile.english.data.articles.ArticlesService"

    const-string v1, "com.rt.mobile.english.data.ApiModule"

    const-string v2, "provideArticleService"

    const/4 v3, 0x1

    .line 305
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 306
    iput-object p1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    .line 307
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "@javax.inject.Named(value=json)/retrofit.RestAdapter"

    .line 317
    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->restAdapter:Ldagger/internal/Binding;

    return-void
.end method

.method public get()Lcom/rt/mobile/english/data/articles/ArticlesService;
    .locals 2

    .line 335
    iget-object v0, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->module:Lcom/rt/mobile/english/data/ApiModule;

    iget-object v1, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->restAdapter:Ldagger/internal/Binding;

    invoke-virtual {v1}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/RestAdapter;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/data/ApiModule;->provideArticleService(Lretrofit/RestAdapter;)Lcom/rt/mobile/english/data/articles/ArticlesService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 299
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->get()Lcom/rt/mobile/english/data/articles/ArticlesService;

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

    .line 326
    iget-object p2, p0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;->restAdapter:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
