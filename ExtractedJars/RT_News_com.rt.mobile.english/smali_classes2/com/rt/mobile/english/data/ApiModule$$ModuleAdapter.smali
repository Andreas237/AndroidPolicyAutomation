.class public final Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;
.super Ldagger/internal/ModuleAdapter;
.source "ApiModule$$ModuleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideMediaServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideChannelsServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGalleryServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideVideoServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideShowServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideHtmlServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonRestAdapterProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonClientProvidesAdapter;,
        Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideEndpointProvidesAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ModuleAdapter<",
        "Lcom/rt/mobile/english/data/ApiModule;",
        ">;"
    }
.end annotation


# static fields
.field private static final INCLUDES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final INJECTS:[Ljava/lang/String;

.field private static final STATIC_INJECTIONS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 17
    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    .line 18
    new-array v1, v0, [Ljava/lang/Class;

    sput-object v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    .line 19
    new-array v0, v0, [Ljava/lang/Class;

    sput-object v0, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 22
    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    sget-object v2, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    sget-object v3, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    sget-object v5, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Ldagger/internal/ModuleAdapter;-><init>(Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Z[Ljava/lang/Class;ZZ)V

    return-void
.end method


# virtual methods
.method public getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/data/ApiModule;)V
    .locals 2

    const-string v0, "retrofit.Endpoint"

    .line 36
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideEndpointProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideEndpointProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "retrofit.client.Client"

    .line 37
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonClientProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonClientProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.google.gson.Gson"

    .line 38
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGsonProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "@javax.inject.Named(value=json)/retrofit.RestAdapter"

    .line 39
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonRestAdapterProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideJsonRestAdapterProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "@javax.inject.Named(value=html)/retrofit.RestAdapter"

    .line 40
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideStringRestAdapterProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.articles.ArticlesService"

    .line 41
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideArticleServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.articles.HtmlService"

    .line 42
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideHtmlServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideHtmlServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.shows.ShowsService"

    .line 43
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideShowServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideShowServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.videos.VideoService"

    .line 44
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideVideoServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideVideoServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.galleries.GalleriesService"

    .line 45
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGalleryServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideGalleryServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.channels.ChannelsService"

    .line 46
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideChannelsServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideChannelsServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.media.MediaService"

    .line 47
    new-instance v1, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideMediaServiceProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter$ProvideMediaServiceProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/ApiModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    return-void
.end method

.method public bridge synthetic getBindings(Ldagger/internal/BindingsGroup;Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p2, Lcom/rt/mobile/english/data/ApiModule;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/data/ApiModule;)V

    return-void
.end method

.method public newModule()Lcom/rt/mobile/english/data/ApiModule;
    .locals 1

    .line 27
    new-instance v0, Lcom/rt/mobile/english/data/ApiModule;

    invoke-direct {v0}, Lcom/rt/mobile/english/data/ApiModule;-><init>()V

    return-object v0
.end method

.method public bridge synthetic newModule()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/ApiModule$$ModuleAdapter;->newModule()Lcom/rt/mobile/english/data/ApiModule;

    move-result-object v0

    return-object v0
.end method
