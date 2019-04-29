.class public final Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;
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
    name = "ProvidePicassoProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Lcom/squareup/picasso/Picasso;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/squareup/picasso/Picasso;",
        ">;"
    }
.end annotation


# instance fields
.field private app:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private client:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lcom/squareup/okhttp/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/rt/mobile/english/data/DataModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/DataModule;)V
    .locals 4

    const-string v0, "com.squareup.picasso.Picasso"

    const-string v1, "com.rt.mobile.english.data.DataModule"

    const-string v2, "providePicasso"

    const/4 v3, 0x1

    .line 161
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 162
    iput-object p1, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    .line 163
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "android.app.Application"

    .line 173
    const-class v1, Lcom/rt/mobile/english/data/DataModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->app:Ldagger/internal/Binding;

    const-string v0, "@javax.inject.Named(value=img)/com.squareup.okhttp.OkHttpClient"

    .line 174
    const-class v1, Lcom/rt/mobile/english/data/DataModule;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->client:Ldagger/internal/Binding;

    return-void
.end method

.method public get()Lcom/squareup/picasso/Picasso;
    .locals 3

    .line 193
    iget-object v0, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->module:Lcom/rt/mobile/english/data/DataModule;

    iget-object v1, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->app:Ldagger/internal/Binding;

    invoke-virtual {v1}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->client:Ldagger/internal/Binding;

    invoke-virtual {v2}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, v1, v2}, Lcom/rt/mobile/english/data/DataModule;->providePicasso(Landroid/app/Application;Lcom/squareup/okhttp/OkHttpClient;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->get()Lcom/squareup/picasso/Picasso;

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

    .line 183
    iget-object p2, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->app:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 184
    iget-object p2, p0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;->client:Ldagger/internal/Binding;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
