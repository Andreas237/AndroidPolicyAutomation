.class public final Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;
.super Ldagger/internal/Binding;
.source "BookmarksRecyclerViewFragment$$InjectAdapter.java"

# interfaces
.implements Ljavax/inject/Provider;
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/Binding<",
        "Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;",
        ">;",
        "Ljavax/inject/Provider<",
        "Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;",
        ">;",
        "Ldagger/MembersInjector<",
        "Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;",
        ">;"
    }
.end annotation


# instance fields
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

    const-string v0, "com.rt.mobile.english.ui.BookmarksRecyclerViewFragment"

    const-string v1, "members/com.rt.mobile.english.ui.BookmarksRecyclerViewFragment"

    .line 29
    const-class v2, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v3, v2}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "com.google.gson.Gson"

    .line 39
    const-class v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    const-string v0, "com.squareup.picasso.Picasso"

    .line 40
    const-class v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    return-void
.end method

.method public get()Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;
    .locals 1

    .line 59
    new-instance v0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;-><init>()V

    .line 60
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->injectMembers(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->get()Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

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

    .line 49
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public injectMembers(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->gson:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/Gson;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    .line 71
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->picasso:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/picasso/Picasso;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->picasso:Lcom/squareup/picasso/Picasso;

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$$InjectAdapter;->injectMembers(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V

    return-void
.end method
