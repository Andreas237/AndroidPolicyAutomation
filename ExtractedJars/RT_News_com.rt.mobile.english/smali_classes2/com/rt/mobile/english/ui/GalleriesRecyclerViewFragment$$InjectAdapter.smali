.class public final Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;
.super Ldagger/internal/Binding;
.source "GalleriesRecyclerViewFragment$$InjectAdapter.java"

# interfaces
.implements Ljavax/inject/Provider;
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/Binding<",
        "Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;",
        ">;",
        "Ldagger/MembersInjector<",
        "Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;",
        ">;"
    }
.end annotation


# instance fields
.field private galleriesService:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lcom/rt/mobile/english/data/galleries/GalleriesService;",
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

.field private picasso:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lcom/squareup/picasso/Picasso;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    const-string v0, "com.rt.mobile.english.ui.GalleriesRecyclerViewFragment"

    const-string v1, "members/com.rt.mobile.english.ui.GalleriesRecyclerViewFragment"

    .line 30
    const-class v2, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v3, v2}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "com.rt.mobile.english.data.galleries.GalleriesService"

    .line 40
    const-class v1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->galleriesService:Ldagger/internal/Binding;

    const-string v0, "com.google.gson.Gson"

    .line 41
    const-class v1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    const-string v0, "com.squareup.picasso.Picasso"

    .line 42
    const-class v1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    return-void
.end method

.method public get()Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;
    .locals 1

    .line 62
    new-instance v0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;-><init>()V

    .line 63
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->injectMembers(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->get()Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

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

    .line 51
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->galleriesService:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public injectMembers(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->galleriesService:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/galleries/GalleriesService;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->galleriesService:Lcom/rt/mobile/english/data/galleries/GalleriesService;

    .line 74
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/Gson;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    .line 75
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/picasso/Picasso;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;->picasso:Lcom/squareup/picasso/Picasso;

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$$InjectAdapter;->injectMembers(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;)V

    return-void
.end method
